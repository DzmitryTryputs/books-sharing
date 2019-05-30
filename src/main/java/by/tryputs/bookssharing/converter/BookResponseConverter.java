package by.tryputs.bookssharing.converter;

import by.tryputs.bookssharing.dto.BookResponseDto;
import by.tryputs.bookssharing.entity.Book;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class BookResponseConverter extends AbstractResponseConverter<Book, BookResponseDto> {

    private GenreResponseConverter genreResponseConverter;
    private AuthorResponseConverter authorResponseConverter;

    @Override
    public BookResponseDto constructDto() {
        return new BookResponseDto();
    }

    @Override
    public Book constructDbo() {
        return new Book();
    }

    protected String[] getIgnoreProperties() {
        return new String[]{"genres", "authors"};
    }

    @Override
    public void convertComplexFieldsForDto(Book sourceDto, BookResponseDto targetDto) {
        targetDto.setGenres(genreResponseConverter.convertToDto(sourceDto.getGenres()));
        targetDto.setAuthors(authorResponseConverter.convertToDto(sourceDto.getAuthors()));
    }
}
