package by.tryputs.bookssharing.converter;

import by.tryputs.bookssharing.dto.GenreRequestDto;
import by.tryputs.bookssharing.entity.Genre;
import org.springframework.stereotype.Component;

@Component
public class GenreRequestConverter implements AbstractRequestConverter<Genre, GenreRequestDto> {

    @Override
    public GenreRequestDto constructDto() {
        return new GenreRequestDto();
    }

    @Override
    public Genre constructDbo() {
        return new Genre();
    }
}
