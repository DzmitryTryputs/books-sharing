package by.tryputs.bookssharing.service;

import by.tryputs.bookssharing.converter.basic.SharingRecordResponseConverter;
import by.tryputs.bookssharing.dto.sharing.SharingRecordDto;
import by.tryputs.bookssharing.entity.SharingCard;
import by.tryputs.bookssharing.entity.SharingRecord;
import by.tryputs.bookssharing.entity.SharingStatus;
import by.tryputs.bookssharing.entity.User;
import by.tryputs.bookssharing.exception.BasicBookSharingException;
import by.tryputs.bookssharing.repository.SharingCardRepository;
import by.tryputs.bookssharing.repository.SharingRecordRepository;
import by.tryputs.bookssharing.util.AuthenticationUtil;
import by.tryputs.bookssharing.util.EntityUtil;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@AllArgsConstructor
public class SharingRecordService {

    private SharingRecordRepository repository;
    private SharingCardRepository sharingCardRepository;
    private AuthenticationUtil authenticationUtil;
    private SharingRecordResponseConverter converter;
    private EntityUtil entityUtil;

    public SharingRecordDto post(Long cardId) throws BasicBookSharingException {
        Long receiverId = authenticationUtil.getUserId();
        SharingCard card =
                sharingCardRepository.findById(cardId)
                        .orElseThrow(() -> new BasicBookSharingException("Card with name hasn't found."));

        if (receiverId != null && SharingStatus.VACANT.equals(card.getStatus())) {
            SharingRecord sharingRecord = new SharingRecord();
            sharingRecord.setReceiver(entityUtil.createEmptyWithId(new User(), receiverId));
            sharingRecord.setReceiveDate(LocalDate.now());
            sharingRecord.setReturnDate(LocalDate.now().plusWeeks(1));
            card.setStatus(SharingStatus.ON_HANDS);
            sharingRecord.setSharingCard(card);
            return converter.convertToDto(repository.save(sharingRecord));
        } else {
            throw new BasicBookSharingException("Card with name " + "hasn't " + "found.");
        }
    }
}
