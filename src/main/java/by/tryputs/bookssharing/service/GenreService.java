package by.tryputs.bookssharing.service;

import by.tryputs.bookssharing.converter.GenreConverter;
import by.tryputs.bookssharing.dto.user.GenreDto;
import by.tryputs.bookssharing.entity.Genre;
import by.tryputs.bookssharing.repository.GenreRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenreService extends AbstractService<Genre, GenreDto, GenreRepository, GenreConverter> {

    @Autowired
    public GenreService(GenreRepository repository, GenreConverter converter) {
        super(repository, converter);
    }
}
