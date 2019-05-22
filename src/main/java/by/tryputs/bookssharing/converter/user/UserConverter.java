package by.tryputs.bookssharing.converter.user;

import by.tryputs.bookssharing.converter.DtoToDboConverter;
import by.tryputs.bookssharing.dto.user.UserToSave;
import by.tryputs.bookssharing.entity.User;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class UserConverter implements DtoToDboConverter<UserToSave, User> {

    @Override
    public UserToSave convertToDto(final User user) {
        throw new UnsupportedOperationException("We shouldn't convert dbo to saving dbo");
    }

    @Override
    public User convertToDbo(final UserToSave userToSave) {
        final User user = new User();
        BeanUtils.copyProperties(userToSave, user);
        return user;
    }
}