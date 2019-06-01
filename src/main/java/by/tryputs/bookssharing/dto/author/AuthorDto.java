package by.tryputs.bookssharing.dto.author;

import by.tryputs.bookssharing.dto.AbstractResponseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@Data
@EqualsAndHashCode(callSuper = true)
public class AuthorDto extends AbstractResponseDto {

    private String firstName;
    private String lastName;
    private LocalDate dob;
}
