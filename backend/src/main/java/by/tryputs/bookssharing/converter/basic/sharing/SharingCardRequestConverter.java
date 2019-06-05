package by.tryputs.bookssharing.converter.basic.sharing;

import by.tryputs.bookssharing.converter.AbstractRequestConverter;
import by.tryputs.bookssharing.dto.sharing.SharingCardRequestDto;
import by.tryputs.bookssharing.entity.Book;
import by.tryputs.bookssharing.entity.SharingCard;
import by.tryputs.bookssharing.entity.SharingStatus;
import by.tryputs.bookssharing.entity.User;
import by.tryputs.bookssharing.util.EntityUtil;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class SharingCardRequestConverter extends AbstractRequestConverter<SharingCard, SharingCardRequestDto> {

    private EntityUtil entityUtil;

    @Override
    public SharingCardRequestDto constructDto() {
        return new SharingCardRequestDto();
    }

    @Override
    public SharingCard constructDbo() {
        return new SharingCard();
    }

    @Override
    public String[] getIgnoreProperties() {
        return new String[]{"bookId", "ownerId"};
    }

    @Override
    public void convertComplexFieldsForDbo(SharingCardRequestDto sourceDto, SharingCard targetDbo) {
        targetDbo.setBook(entityUtil.createEmptyWithId(new Book(), sourceDto.getBookId()));
        targetDbo.setOwner(entityUtil.createEmptyWithId(new User(), sourceDto.getOwnerId()));
        targetDbo.setStatus(SharingStatus.VACANT);
    }
}
