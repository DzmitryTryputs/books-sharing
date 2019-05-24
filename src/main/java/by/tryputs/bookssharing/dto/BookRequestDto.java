package by.tryputs.bookssharing.dto;

import by.tryputs.bookssharing.entity.Author;
import by.tryputs.bookssharing.entity.Genre;
import by.tryputs.bookssharing.entity.SharingCard;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class BookRequestDto implements AbstractRequestDto {

    private String title;
    private Long pages;
    private List<Long> genresId = new ArrayList<>();
    private List<Long> authorsId = new ArrayList<>();
}
