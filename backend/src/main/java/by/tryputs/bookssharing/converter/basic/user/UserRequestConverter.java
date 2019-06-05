package by.tryputs.bookssharing.converter.basic.user;

import by.tryputs.bookssharing.converter.AbstractConverter;
import by.tryputs.bookssharing.dto.user.UserSignUpDto;
import by.tryputs.bookssharing.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserRequestConverter extends AbstractConverter<User, UserSignUpDto> {

    @Override
    public UserSignUpDto constructDto() {
        return new UserSignUpDto();
    }

    @Override
    public User constructDbo() {
        return new User();
    }
}