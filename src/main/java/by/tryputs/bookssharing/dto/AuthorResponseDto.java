package by.tryputs.bookssharing.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class AuthorResponseDto extends AbstractResponseDto {

    private String firstName;
    private String lastName;
    private LocalDate dob;
    private List<BookResponseDto> books = new ArrayList<>();
}
