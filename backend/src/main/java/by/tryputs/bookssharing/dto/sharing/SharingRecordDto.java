package by.tryputs.bookssharing.dto.sharing;

import by.tryputs.bookssharing.dto.AbstractResponseDto;
import by.tryputs.bookssharing.dto.user.UserDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@Data
@EqualsAndHashCode(callSuper = true)
public class SharingRecordDto extends AbstractResponseDto {

    private UserDto receiver;
    private LocalDate receiveDate;
    private LocalDate returnDate;
}
