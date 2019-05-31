package by.tryputs.bookssharing.dto;

import lombok.Data;

@Data
public class UserSignUpDto implements AbstractRequestDto {

    private String firstName;
    private String lastName;
    private String password;
    private String email;
}
