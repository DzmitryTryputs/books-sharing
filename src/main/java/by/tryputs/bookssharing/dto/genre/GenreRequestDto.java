package by.tryputs.bookssharing.dto.genre;

import by.tryputs.bookssharing.dto.AbstractRequestDto;
import lombok.Data;

@Data
public class GenreRequestDto implements AbstractRequestDto {

    private String name;
}
