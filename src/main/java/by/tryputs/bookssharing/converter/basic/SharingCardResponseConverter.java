package by.tryputs.bookssharing.converter.basic;

import by.tryputs.bookssharing.converter.AbstractResponseConverter;
import by.tryputs.bookssharing.dto.sharing.SharingCardDto;
import by.tryputs.bookssharing.entity.SharingCard;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class SharingCardResponseConverter extends AbstractResponseConverter<SharingCard, SharingCardDto> {

    private BookResponseConverter bookResponseConverter;
    private UserResponseConverter userResponseConverter;

    @Override
    public SharingCardDto constructDto() {
        return new SharingCardDto();
    }

    @Override
    public SharingCard constructDbo() {
        return new SharingCard();
    }

    @Override
    public String[] getIgnoreProperties() {
        return new String[]{"records", "book", "owner"};
    }

    @Override
    public void convertComplexFieldsForDto(SharingCard sourceDbo, SharingCardDto targetDto) {
        targetDto.setBook(bookResponseConverter.convertToDto(sourceDbo.getBook()));
        targetDto.setUser(userResponseConverter.convertToDto(sourceDbo.getOwner()));
    }
}
