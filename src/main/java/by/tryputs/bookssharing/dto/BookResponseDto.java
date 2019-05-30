package by.tryputs.bookssharing.dto;

import by.tryputs.bookssharing.entity.SharingCard;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class BookResponseDto extends AbstractResponseDto {

    private String title;
    private Long pages;
    private List<GenreResponseDto> genres = new ArrayList<>();
    private List<AuthorResponseDto> authors = new ArrayList<>();
}
