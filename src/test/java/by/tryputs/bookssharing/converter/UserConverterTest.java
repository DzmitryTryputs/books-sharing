package by.tryputs.bookssharing.converter;

import by.tryputs.bookssharing.AbstractSpringMvcTest;
import by.tryputs.bookssharing.converter.basic.user.UserRequestConverter;
import by.tryputs.bookssharing.converter.basic.user.UserResponseConverter;
import by.tryputs.bookssharing.dto.user.UserDto;
import by.tryputs.bookssharing.dto.user.UserSignUpDto;
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
    public void convertResponseToDboTest() {
        convertResponseToDbo(UserMock.getUserDtoMock());
    }

    @Test
    public void convertToResponseDtoTest() {
        convertToResponseDto(UserMock.getUserDboMock());
    }

    @Test
    public void convertRequestToDboTest() {
        convertRequestToDbo(UserMock.getUserSignUpDtoMock());
    }

    @Test
    public void convertToRequestDtoTest() {
        convertToRequestDto(UserMock.getUserDboMock());
    }

    private void convertResponseToDbo(final UserDto dto) {
        final User dbo = responseConverter.convertToDbo(dto);
        checkResponseConverting(dbo, dto);
    }

    private void convertToResponseDto(final User dbo) {
        final UserDto dto = responseConverter.convertToDto(dbo);
        checkResponseConverting(dbo, dto);
    }

    private void convertRequestToDbo(final UserSignUpDto dto) {
        final User dbo = requestConverter.convertToDbo(dto);
        checkRequestConverting(dbo, dto);
    }

    private void convertToRequestDto(final User dbo) {
        final UserSignUpDto dto = requestConverter.convertToDto(dbo);
        checkRequestConverting(dbo, dto);
    }

    private void checkResponseConverting(final User dbo, final UserDto dto) {
        assertEquals(dto.getId(), dbo.getId());
        assertEquals(dto.getEmail(), dbo.getEmail());
        assertEquals(dto.getFirstName(), dbo.getFirstName());
        assertEquals(dto.getLastName(), dbo.getLastName());
    }

    private void checkRequestConverting(final User dbo, final UserSignUpDto dto) {
        assertEquals(dto.getEmail(), dbo.getEmail());
        assertEquals(dto.getFirstName(), dbo.getFirstName());
        assertEquals(dto.getLastName(), dbo.getLastName());
        assertEquals(dto.getPassword(), dbo.getPassword());
    }
}
