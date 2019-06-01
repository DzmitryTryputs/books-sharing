package by.tryputs.bookssharing.converter.basic;

import by.tryputs.bookssharing.converter.AbstractResponseConverter;
import by.tryputs.bookssharing.dto.user.UserDto;
import by.tryputs.bookssharing.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserResponseConverter extends AbstractResponseConverter<User, UserDto> {

    @Override
    public UserDto constructDto() {
        return new UserDto();
    }

    @Override
    public User constructDbo() {
        return new User();
    }
}
