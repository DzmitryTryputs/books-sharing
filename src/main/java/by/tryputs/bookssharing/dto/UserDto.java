package by.tryputs.bookssharing.dto;

import lombok.Data;

@Data
public class UserDto extends AbstractResponseDto {

    private String firstName;
    private String lastName;
    private String password;
    private String email;
}
