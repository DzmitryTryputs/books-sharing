package by.tryputs.bookssharing.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class ResponseGenreDto extends AbstractResponseDto {

    private String name;
}
