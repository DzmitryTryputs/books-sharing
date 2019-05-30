package by.tryputs.bookssharing.converter;

import by.tryputs.bookssharing.dto.AuthorResponseDto;
import by.tryputs.bookssharing.entity.Author;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class AuthorResponseConverter extends AbstractResponseConverter<Author, AuthorResponseDto> {

    @Override
    public AuthorResponseDto constructDto() {
        return new AuthorResponseDto();
    }

    @Override
    public Author constructDbo() {
        return new Author();
    }

    protected String[] getIgnoreProperties() {
        return new String[]{"books"};
    }
}
