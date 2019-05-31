package by.tryputs.bookssharing.dto;

import by.tryputs.bookssharing.entity.SharingStatus;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class SharingCardResponseDto extends AbstractResponseDto {

    private BookResponseDto book;
    private UserSignUpDto owner;
    private SharingStatus status;
    private List<SharingRecordResponseDto> sharingRecords = new ArrayList<>();
}
