package by.tryputs.bookssharing.converter.basic.genre;

import by.tryputs.bookssharing.converter.AbstractResponseConverter;
import by.tryputs.bookssharing.dto.genre.GenreDto;
import by.tryputs.bookssharing.entity.Genre;
import org.springframework.stereotype.Component;

@Component
public class GenreResponseConverter extends AbstractResponseConverter<Genre, GenreDto> {
    @Override
    public GenreDto constructDto() {
        return new GenreDto();
    }

    @Override
    public Genre constructDbo() {
        return new Genre();
    }

    @Override
    public String[] getIgnoreProperties() {
        return new String[]{"books"};
    }
}
