package by.tryputs.bookssharing.dto.genre;

import by.tryputs.bookssharing.dto.AbstractResponseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class GenreDto extends AbstractResponseDto {

    private String name;
}
