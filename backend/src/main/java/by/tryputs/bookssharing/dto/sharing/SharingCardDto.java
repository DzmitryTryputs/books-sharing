package by.tryputs.bookssharing.dto.sharing;

import by.tryputs.bookssharing.dto.AbstractResponseDto;
import by.tryputs.bookssharing.dto.book.BookDto;
import by.tryputs.bookssharing.dto.user.UserDto;
import by.tryputs.bookssharing.entity.SharingStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class SharingCardDto extends AbstractResponseDto {

    private BookDto book;
    private UserDto user;
    private SharingStatus status;
    private List<SharingRecordDto> sharingRecords = new ArrayList<>();
}
