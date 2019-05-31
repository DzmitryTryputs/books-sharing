package by.tryputs.bookssharing.dto;

import lombok.Data;

@Data
public class SharingCardRequestDto implements AbstractRequestDto {

    private Long userId;
    private Long bookId;

}
