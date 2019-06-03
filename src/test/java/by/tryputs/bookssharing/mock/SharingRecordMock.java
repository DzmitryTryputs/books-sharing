package by.tryputs.bookssharing.mock;

import by.tryputs.bookssharing.dto.sharing.SharingRecordDto;
import by.tryputs.bookssharing.entity.SharingRecord;

import java.time.LocalDate;

public class SharingRecordMock {

    private static final LocalDate RECEIVE_DATE = LocalDate.of(2019, 6, 10);
    private static final LocalDate RETURN_DATE = RECEIVE_DATE.plusWeeks(1);


    public static SharingRecord getSharingRecordDbo() {
        SharingRecord sharingRecord = new SharingRecord();
        sharingRecord.setReceiveDate(RECEIVE_DATE);
        sharingRecord.setReturnDate(RETURN_DATE);
        sharingRecord.setReceiver(UserMock.getUserDboMock());
        sharingRecord.setId(1L);

        return sharingRecord;
    }

    public static SharingRecordDto getSharingRecordDto() {
        SharingRecordDto sharingRecord = new SharingRecordDto();
        sharingRecord.setReceiveDate(RECEIVE_DATE);
        sharingRecord.setReturnDate(RETURN_DATE);
        sharingRecord.setReceiver(UserMock.getUserDtoMock());
        sharingRecord.setId(1L);

        return sharingRecord;
    }
}
