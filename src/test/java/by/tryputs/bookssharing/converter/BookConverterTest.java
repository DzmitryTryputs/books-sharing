package by.tryputs.bookssharing.converter;

import by.tryputs.bookssharing.AbstractSpringMvcTest;
import by.tryputs.bookssharing.converter.basic.book.BookRequestConverter;
import by.tryputs.bookssharing.converter.basic.book.BookResponseConverter;
import by.tryputs.bookssharing.dto.book.BookDto;
import by.tryputs.bookssharing.dto.book.BookRequestDto;
import by.tryputs.bookssharing.entity.Book;
import by.tryputs.bookssharing.mock.BookMock;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;

public class BookConverterTest extends AbstractSpringMvcTest {

    @Autowired
    private BookRequestConverter bookRequestConverter;

    @Autowired
    private BookResponseConverter bookResponseConverter;

    @Test
    public void convertResponseToDboTest() {
        convertResponseToDbo(BookMock.getBookDtoMock());
    }

    @Test
    public void convertToResponseDtoTest() {
        convertToResponseDto(BookMock.getBookDboMock());
    }

    @Test
    public void convertRequestDboTest() {
        convertRequestToDbo(BookMock.getBookRequestDtoMock());
    }

    @Test
    public void convertToRequestDtoTest() {
        convertToRequestDto(BookMock.getBookDboMock());
    }

    private void convertResponseToDbo(final BookDto dto) {
        final Book dbo = bookResponseConverter.convertToDbo(dto);
        checkResponseConverting(dbo, dto);
    }

    private void convertToResponseDto(final Book dbo) {
        final BookDto dto = bookResponseConverter.convertToDto(dbo);
        checkResponseConverting(dbo, dto);
    }

    private void convertRequestToDbo(final BookRequestDto dto) {
        final Book dbo = bookRequestConverter.convertToDbo(dto);
        checkRequestConverting(dbo, dto);
    }


    private void convertToRequestDto(final Book dbo) {
        final BookRequestDto dto = bookRequestConverter.convertToDto(dbo);
        checkRequestConverting(dbo, dto);
    }

    private void checkRequestConverting(final Book dbo, final BookRequestDto dto) {
        assertEquals(dto.getPages(), dbo.getPages());
        assertEquals(dto.getTitle(), dbo.getTitle());
    }

    private void checkResponseConverting(final Book dbo, final BookDto dto) {
        assertEquals(dto.getId(), dbo.getId());
        assertEquals(dto.getPages(), dbo.getPages());
        assertEquals(dto.getTitle(), dbo.getTitle());
    }
}
