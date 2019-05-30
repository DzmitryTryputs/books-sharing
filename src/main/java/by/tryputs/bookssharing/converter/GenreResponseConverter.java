package by.tryputs.bookssharing.converter;

import by.tryputs.bookssharing.dto.GenreResponseDto;
import by.tryputs.bookssharing.entity.Genre;
import org.springframework.stereotype.Component;

@Component
public class GenreResponseConverter extends AbstractResponseConverter<Genre, GenreResponseDto> {
    @Override
    public GenreResponseDto constructDto() {
        return new GenreResponseDto();
    }

    @Override
    public Genre constructDbo() {
        return new Genre();
    }

    protected String[] getIgnoreProperties() {
        return new String[]{"genres"};
    }
}
