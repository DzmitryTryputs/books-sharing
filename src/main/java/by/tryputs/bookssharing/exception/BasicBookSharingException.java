package by.tryputs.bookssharing.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BasicBookSharingException extends RuntimeException {

    public BasicBookSharingException(String message) {
        super(message);
    }
}