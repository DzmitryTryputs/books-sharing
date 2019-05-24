package by.tryputs.bookssharing.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class GenreResponseDto extends AbstractResponseDto {

    private String name;
}
