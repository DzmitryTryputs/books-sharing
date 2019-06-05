package by.tryputs.bookssharing.dto.user;

import by.tryputs.bookssharing.dto.AbstractResponseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class UserDto extends AbstractResponseDto {

    private String firstName;
    private String lastName;
    private String email;
}
