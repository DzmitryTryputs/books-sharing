package by.tryputs.bookssharing.converter;

import by.tryputs.bookssharing.dto.user.UserDto;
import by.tryputs.bookssharing.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserConverter extends AbstractConverter<User, UserDto> {

    @Override
    protected UserDto constructDto() {
        return new UserDto();
    }

    @Override
    protected User constructDbo() {
        return new User();
    }
}