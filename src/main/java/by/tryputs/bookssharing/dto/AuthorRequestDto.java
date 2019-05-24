package by.tryputs.bookssharing.dto;

import by.tryputs.bookssharing.config.serializer.DateDeserializer;
import by.tryputs.bookssharing.config.serializer.DateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import java.time.LocalDate;

@Data
public class AuthorRequestDto implements AbstractRequestDto {

    private String firstName;
    private String lastName;
    @JsonDeserialize(using = DateDeserializer.class)
    @JsonSerialize(using = DateSerializer.class)
    private LocalDate dob;
}
