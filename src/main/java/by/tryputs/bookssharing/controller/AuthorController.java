package by.tryputs.bookssharing.controller;

import by.tryputs.bookssharing.dto.AuthorRequestDto;
import by.tryputs.bookssharing.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authors")
public class AuthorController extends AbstractController<AuthorRequestDto, AuthorService> {

    @Autowired
    public AuthorController(AuthorService service) {
        super(service);
    }
}
