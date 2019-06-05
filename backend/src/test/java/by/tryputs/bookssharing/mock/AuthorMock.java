package by.tryputs.bookssharing.mock;

import by.tryputs.bookssharing.dto.author.AuthorDto;
import by.tryputs.bookssharing.dto.author.AuthorRequestDto;
import by.tryputs.bookssharing.entity.Author;

import java.time.LocalDate;
import java.util.Collections;

public class AuthorMock {

    private static final String FIRST_NAME = "authorLastName";
    private static final String LAST_NAME = "authorFirstName";
    private static final LocalDate DATE_OF_BIRTH = LocalDate.of(2019, 6, 3);

    public static Author getAuthorDboMock() {
        Author author = new Author();
        author.setDob(DATE_OF_BIRTH);
        author.setFirstName(FIRST_NAME);
        author.setLastName(LAST_NAME);
        author.setBooks(Collections.singletonList(BookMock.getBookDboMock()));
        author.setId(1L);

        return author;
    }

    public static AuthorRequestDto getAuthorResponseDto() {
        AuthorRequestDto authorRequestDto = new AuthorRequestDto();
        authorRequestDto.setDob(DATE_OF_BIRTH);
        authorRequestDto.setFirstName(FIRST_NAME);
        authorRequestDto.setLastName(LAST_NAME);

        return authorRequestDto;
    }

    public static AuthorDto getAuthorRequestDto() {
        AuthorDto authorDto = new AuthorDto();
        authorDto.setDob(DATE_OF_BIRTH);
        authorDto.setFirstName(FIRST_NAME);
        authorDto.setLastName(LAST_NAME);
        authorDto.setId(1L);

        return authorDto;
    }
}
