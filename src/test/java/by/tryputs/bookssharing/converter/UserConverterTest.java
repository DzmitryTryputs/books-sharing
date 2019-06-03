package by.tryputs.bookssharing.converter;

import by.tryputs.bookssharing.AbstractSpringMvcTest;
import by.tryputs.bookssharing.converter.basic.user.UserRequestConverter;
import by.tryputs.bookssharing.converter.basic.user.UserResponseConverter;
import by.tryputs.bookssharing.dto.user.UserDto;
import by.tryputs.bookssharing.entity.User;
import by.tryputs.bookssharing.mock.UserMock;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;

public class UserConverterTest extends AbstractSpringMvcTest {

    @Autowired
    private UserResponseConverter responseConverter;
    @Autowired
    private UserRequestConverter requestConverter;

    @Test
    public void convertToDboTest() {
        convertToDbo(UserMock.getUserDtoMock());
    }

    @Test
    public void convertToDtoTest() {
        convertToDto(UserMock.getUserDboMock());
    }

    private void convertToDbo(final UserDto dto) {
        final User dbo = responseConverter.convertToDbo(dto);
        checkResponseConverting(dbo, dto);
    }

    private void convertToDto(final User dbo) {
        final UserDto dto = responseConverter.convertToDto(dbo);
        checkResponseConverting(dbo, dto);
    }

    private void checkResponseConverting(final User dbo, final UserDto dto) {
        assertEquals(dto.getId(), dbo.getId());
        assertEquals(dto.getEmail(), dbo.getEmail());
        assertEquals(dto.getFirstName(), dbo.getFirstName());
        assertEquals(dto.getLastName(), dbo.getLastName());
    }
}
