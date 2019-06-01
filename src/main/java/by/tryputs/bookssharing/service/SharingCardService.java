package by.tryputs.bookssharing.service;

import by.tryputs.bookssharing.converter.basic.SharingCardRequestConverter;
import by.tryputs.bookssharing.converter.basic.SharingCardResponseConverter;
import by.tryputs.bookssharing.dto.sharing.SharingCardDto;
import by.tryputs.bookssharing.dto.sharing.SharingCardRequestDto;
import by.tryputs.bookssharing.entity.SharingCard;
import by.tryputs.bookssharing.repository.SharingCardRepository;
import by.tryputs.bookssharing.util.AuthenticationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SharingCardService extends AbstractService<SharingCard, SharingCardRequestDto, SharingCardDto,
        SharingCardRepository, SharingCardRequestConverter, SharingCardResponseConverter> {

    private AuthenticationUtil authenticationUtil;

    @Autowired
    public SharingCardService(SharingCardRequestConverter sharingCardRequestConverter,
                              SharingCardRepository repository,
                              SharingCardResponseConverter sharingCardResponseConverter,
                              AuthenticationUtil authenticationUtil) {
        super(repository, sharingCardRequestConverter, sharingCardResponseConverter);
        this.authenticationUtil = authenticationUtil;
    }

    @Override
    public SharingCardDto post(SharingCardRequestDto dto) {
        dto.setOwnerId(authenticationUtil.getUserId());
        return super.post(dto);
    }
}
