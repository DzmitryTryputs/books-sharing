package by.tryputs.bookssharing.converter.basic;

import by.tryputs.bookssharing.converter.AbstractRequestConverter;
import by.tryputs.bookssharing.dto.book.BookRequestDto;
import by.tryputs.bookssharing.entity.Author;
import by.tryputs.bookssharing.entity.Book;
import by.tryputs.bookssharing.entity.Genre;
import by.tryputs.bookssharing.util.EntityUtil;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class BookRequestConverter extends AbstractRequestConverter<Book, BookRequestDto> {

    private EntityUtil entityUtil;

    @Override
    public BookRequestDto constructDto() {
        return new BookRequestDto();
    }

    @Override
    public Book constructDbo() {
        return new Book();
    }

    @Override
    public void convertComplexFieldsForDbo(BookRequestDto sourceDto, Book targetDbo) {
        targetDbo.setGenres(sourceDto.getGenresId().stream().map(id -> entityUtil.createEmptyWithId(new Genre(), id)).collect(Collectors.toList()));
        targetDbo.setAuthors(sourceDto.getAuthorsId().stream().map(id -> entityUtil.createEmptyWithId(new Author(), id)).collect(Collectors.toList()));
    }
}
