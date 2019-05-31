package by.tryputs.bookssharing.converter;

import by.tryputs.bookssharing.dto.UserSignUpDto;
import by.tryputs.bookssharing.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserConverter extends AbstractConverter<User, UserSignUpDto> {

    @Override
    public UserSignUpDto constructDto() {
        return new UserSignUpDto();
    }

    @Override
    public User constructDbo() {
        return new User();
    }
}