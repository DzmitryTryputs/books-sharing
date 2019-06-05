package by.tryputs.bookssharing.dto.sharing;

import by.tryputs.bookssharing.dto.AbstractRequestDto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class SharingCardRequestDto implements AbstractRequestDto {

    @JsonIgnore
    private Long ownerId;
    private Long bookId;
}