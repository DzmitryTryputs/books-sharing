package by.tryputs.bookssharing.converter.basic;

import by.tryputs.bookssharing.converter.AbstractRequestConverter;
import by.tryputs.bookssharing.dto.author.AuthorRequestDto;
import by.tryputs.bookssharing.entity.Author;
import org.springframework.stereotype.Component;

@Component
public class AuthorRequestConverter extends AbstractRequestConverter<Author, AuthorRequestDto> {

    @Override
    public AuthorRequestDto constructDto() {
        return new AuthorRequestDto();
    }

    @Override
    public Author constructDbo() {
        return new Author();
    }
}
