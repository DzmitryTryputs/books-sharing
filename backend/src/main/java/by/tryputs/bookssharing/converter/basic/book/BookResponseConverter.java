package by.tryputs.bookssharing.converter.basic.book;

import by.tryputs.bookssharing.converter.AbstractResponseConverter;
import by.tryputs.bookssharing.converter.basic.author.AuthorResponseConverter;
import by.tryputs.bookssharing.converter.basic.genre.GenreResponseConverter;
import by.tryputs.bookssharing.dto.book.BookDto;
import by.tryputs.bookssharing.entity.Book;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class BookResponseConverter extends AbstractResponseConverter<Book, BookDto> {

    private GenreResponseConverter genreResponseConverter;
    private AuthorResponseConverter authorResponseConverter;

    @Override
    public BookDto constructDto() {
        return new BookDto();
    }

    @Override
    public Book constructDbo() {
        return new Book();
    }

    @Override
    public String[] getIgnoreProperties() {
        return new String[]{"genres", "authors"};
    }

    @Override
    public void convertComplexFieldsForDto(Book sourceDto, BookDto targetDto) {
        targetDto.setGenres(genreResponseConverter.convertToDto(sourceDto.getGenres()));
        targetDto.setAuthors(authorResponseConverter.convertToDto(sourceDto.getAuthors()));
    }
}
