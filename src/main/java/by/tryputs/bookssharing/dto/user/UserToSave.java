package by.tryputs.bookssharing.dto.user;

import lombok.Data;

@Data
public class UserToSave {

    private String firstName;
    private String lastName;
    private String password;
    private String email;
}
