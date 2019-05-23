package by.tryputs.bookssharing.controller;

import by.tryputs.bookssharing.dto.user.GenreDto;
import by.tryputs.bookssharing.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/genres")
public class GenreController extends AbstractController<GenreDto, GenreService> {

    @Autowired
    public GenreController(GenreService service) {
        super(service);
    }
}
