package by.tryputs.bookssharing.converter;

import by.tryputs.bookssharing.dto.BookResponseDto;
import by.tryputs.bookssharing.entity.Book;
import org.springframework.stereotype.Component;

@Component
public class BookResponseConverter implements AbstractResponseConverter<Book, BookResponseDto> {
    @Override
    public BookResponseDto constructDto() {
        return new BookResponseDto();
    }

    @Override
    public Book constructDbo() {
        return new Book();
    }
}
