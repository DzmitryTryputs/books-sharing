package by.tryputs.bookssharing.converter;

import by.tryputs.bookssharing.dto.ResponseGenreDto;
import by.tryputs.bookssharing.entity.Genre;
import org.springframework.stereotype.Component;

@Component
public class GenreResponseConverter implements AbstractResponseConverter<Genre, ResponseGenreDto> {
    @Override
    public ResponseGenreDto constructDto() {
        return new ResponseGenreDto();
    }

    @Override
    public Genre constructDbo() {
        return new Genre();
    }
}
