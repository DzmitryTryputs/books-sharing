package by.tryputs.bookssharing.converter;

import by.tryputs.bookssharing.dto.user.AbstractDto;
import by.tryputs.bookssharing.dto.user.GenreDto;
import by.tryputs.bookssharing.entity.Genre;
import by.tryputs.bookssharing.entity.IdentifiableEntity;
import org.springframework.stereotype.Component;

@Component
public class GenreConverter extends AbstractConverter<Genre, GenreDto> {

    @Override
    protected GenreDto constructDto() {
        return new GenreDto();
    }

    @Override
    protected Genre constructDbo() {
        return new Genre();
    }
}
