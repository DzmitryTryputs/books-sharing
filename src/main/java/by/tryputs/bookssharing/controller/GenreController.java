package by.tryputs.bookssharing.controller;

import by.tryputs.bookssharing.dto.RequestGenreDto;
import by.tryputs.bookssharing.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/genres")
public class GenreController extends AbstractController<RequestGenreDto, GenreService> {

    @Autowired
    public GenreController(GenreService service) {
        super(service);
    }
}
