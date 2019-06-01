package by.tryputs.bookssharing.converter.basic;

import by.tryputs.bookssharing.converter.AbstractResponseConverter;
import by.tryputs.bookssharing.dto.sharing.SharingRecordDto;
import by.tryputs.bookssharing.entity.SharingRecord;
import org.springframework.stereotype.Component;

@Component
public class SharingRecordResponseConverter extends AbstractResponseConverter<SharingRecord, SharingRecordDto> {
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
        return new String[]{"userId", "ownerId"};
    }
}
