package by.tryputs.bookssharing.dto.book;

import by.tryputs.bookssharing.dto.AbstractResponseDto;
import by.tryputs.bookssharing.dto.author.AuthorDto;
import by.tryputs.bookssharing.dto.genre.GenreDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class BookDto extends AbstractResponseDto {

    private String title;
    private Long pages;
    private List<GenreDto> genres = new ArrayList<>();
    private List<AuthorDto> authors = new ArrayList<>();
}
