package by.tryputs.bookssharing.converter;

import by.tryputs.bookssharing.dto.UserDto;
import by.tryputs.bookssharing.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserConverter extends AbstractConverter<User, UserDto> {

    @Override
    public UserDto constructDto() {
        return new UserDto();
    }

    @Override
    public User constructDbo() {
        return new User();
    }
}