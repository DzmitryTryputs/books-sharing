package by.tryputs.bookssharing.converter;

import by.tryputs.bookssharing.dto.AuthorResponseDto;
import by.tryputs.bookssharing.entity.Author;
import org.springframework.stereotype.Component;

@Component
public class AuthorResponseConverter implements AbstractResponseConverter<Author, AuthorResponseDto> {

    @Override
    public AuthorResponseDto constructDto() {
        return new AuthorResponseDto();
    }

    @Override
    public Author constructDbo() {
        return new Author();
    }
}
