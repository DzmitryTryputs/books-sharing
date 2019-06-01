package by.tryputs.bookssharing.controller;

import by.tryputs.bookssharing.dto.book.BookRequestDto;
import by.tryputs.bookssharing.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
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