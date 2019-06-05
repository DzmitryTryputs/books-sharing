package by.tryputs.bookssharing.mock;

import by.tryputs.bookssharing.dto.user.UserDto;
import by.tryputs.bookssharing.dto.user.UserSignInDto;
import by.tryputs.bookssharing.dto.user.UserSignUpDto;
import by.tryputs.bookssharing.entity.Role;
import by.tryputs.bookssharing.entity.User;

import java.util.Collections;

public class UserMock {

    private static final String EMAIL = "username";
    private static final String FIRST_NAME = "userLastName";
    private static final String LAST_NAME = "userFirstName";
    private static final String PASSWORD = "password";

    public static User getUserDboMock() {
        final User user = new User();

        user.setEmail(EMAIL);
        user.setFirstName(FIRST_NAME);
        user.setLastName(LAST_NAME);
        user.setId(1L);
        Role role = new Role();
        role.setName("USER");
        user.setRoles(Collections.singletonList(role));
        user.setId(1L);

        return user;
    }

    public static UserDto getUserDtoMock() {
        final UserDto userDto = new UserDto();
        userDto.setId(1L);
        userDto.setFirstName(FIRST_NAME);
        userDto.setLastName(LAST_NAME);
        userDto.setEmail(EMAIL);

        return userDto;
    }

    public static UserSignUpDto getUserSignUpDtoMock() {
        final UserSignUpDto userSignUpDto = new UserSignUpDto();
        userSignUpDto.setFirstName(FIRST_NAME);
        userSignUpDto.setLastName(LAST_NAME);
        userSignUpDto.setEmail(EMAIL);
        userSignUpDto.setPassword(PASSWORD);

        return userSignUpDto;
    }

    public static UserSignInDto getUserSignInDto() {
        final UserSignInDto userSignInDto = new UserSignInDto();
        userSignInDto.setEmail(EMAIL);
        userSignInDto.setPassword(PASSWORD);

        return userSignInDto;
    }
}
