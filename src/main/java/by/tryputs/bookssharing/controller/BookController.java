package by.tryputs.bookssharing.controller;

import by.tryputs.bookssharing.dto.BookRequestDto;
import by.tryputs.bookssharing.entity.Book;
import by.tryputs.bookssharing.service.BookService;
import by.tryputs.bookssharing.service.GenreService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/books")
public class BookController extends AbstractController<BookRequestDto, BookService>{

    @Autowired
    public BookController(BookService service) {
        super(service);
    }
}