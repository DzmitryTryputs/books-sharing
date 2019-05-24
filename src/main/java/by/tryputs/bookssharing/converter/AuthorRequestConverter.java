package by.tryputs.bookssharing.converter;

import by.tryputs.bookssharing.dto.AuthorRequestDto;
import by.tryputs.bookssharing.entity.Author;
import org.springframework.stereotype.Component;

@Component
public class AuthorRequestConverter implements AbstractRequestConverter<Author, AuthorRequestDto> {

    @Override
    public AuthorRequestDto constructDto() {
        return new AuthorRequestDto();
    }

    @Override
    public Author constructDbo() {
        return new Author();
    }
}
