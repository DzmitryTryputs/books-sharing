package by.tryputs.bookssharing.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class AuthorRequestDto implements AbstractRequestDto {

    private String firstName;
    private String lastName;
    private LocalDate dob;
}
