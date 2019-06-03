package by.tryputs.bookssharing.mock;

import by.tryputs.bookssharing.dto.genre.GenreDto;
import by.tryputs.bookssharing.dto.genre.GenreRequestDto;
import by.tryputs.bookssharing.entity.Genre;

public class GenreMock {

    private static final String NAME = "genreName";

    public static Genre getGenreDboMock() {
        Genre genre = new Genre();
        genre.setName(NAME);
        genre.setId(1L);

        return genre;
    }

    public static GenreDto getGenreResponseDtoMock() {
        GenreDto genre = new GenreDto();
        genre.setName(NAME);
        genre.setId(1L);

        return genre;
    }

    public static GenreRequestDto getGenreRequestDtoMock() {
        GenreRequestDto genre = new GenreRequestDto();
        genre.setName(NAME);

        return genre;
    }
}
