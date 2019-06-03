package by.tryputs.bookssharing.converter.basic.author;

import by.tryputs.bookssharing.converter.AbstractResponseConverter;
import by.tryputs.bookssharing.dto.author.AuthorDto;
import by.tryputs.bookssharing.entity.Author;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class AuthorResponseConverter extends AbstractResponseConverter<Author, AuthorDto> {

    @Override
    public AuthorDto constructDto() {
        return new AuthorDto();
    }

    @Override
    public Author constructDbo() {
        return new Author();
    }

}
