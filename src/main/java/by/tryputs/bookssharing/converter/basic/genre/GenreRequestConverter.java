package by.tryputs.bookssharing.converter.basic.genre;

import by.tryputs.bookssharing.converter.AbstractRequestConverter;
import by.tryputs.bookssharing.dto.genre.GenreRequestDto;
import by.tryputs.bookssharing.entity.Genre;
import org.springframework.stereotype.Component;

@Component
public class GenreRequestConverter extends AbstractRequestConverter<Genre, GenreRequestDto> {

    @Override
    public GenreRequestDto constructDto() {
        return new GenreRequestDto();
    }

    @Override
    public Genre constructDbo() {
        return new Genre();
    }
}
