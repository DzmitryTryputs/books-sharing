package by.tryputs.bookssharing.dto.book;

import by.tryputs.bookssharing.dto.AbstractRequestDto;
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
