package by.tryputs.bookssharing.converter.basic.sharing;

import by.tryputs.bookssharing.converter.AbstractResponseConverter;
import by.tryputs.bookssharing.converter.basic.user.UserResponseConverter;
import by.tryputs.bookssharing.dto.sharing.SharingRecordDto;
import by.tryputs.bookssharing.entity.SharingRecord;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class SharingRecordResponseConverter extends AbstractResponseConverter<SharingRecord, SharingRecordDto> {

    private UserResponseConverter userResponseConverter;

    @Override
    public SharingRecordDto constructDto() {
        return new SharingRecordDto();
    }

    @Override
    public SharingRecord constructDbo() {
        return new SharingRecord();
    }

    @Override
    public String[] getIgnoreProperties() {
        return new String[]{"receiver"};
    }

    @Override
    public void convertComplexFieldsForDto(SharingRecord sourceDbo, SharingRecordDto targetDto) {
        targetDto.setReceiver(userResponseConverter.convertToDto(sourceDbo.getReceiver()));
    }
}
