package by.tryputs.bookssharing.converter;

import by.tryputs.bookssharing.dto.RequestGenreDto;
import by.tryputs.bookssharing.dto.ResponseGenreDto;
import by.tryputs.bookssharing.entity.Genre;
import org.springframework.stereotype.Component;

@Component
public class GenreRequestConverter implements AbstractRequestConverter<Genre, RequestGenreDto> {

    @Override
    public RequestGenreDto constructDto() {
        return new RequestGenreDto();
    }

    @Override
    public Genre constructDbo() {
        return new Genre();
    }
}
