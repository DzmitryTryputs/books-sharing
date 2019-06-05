package by.tryputs.bookssharing.service;

import by.tryputs.bookssharing.converter.basic.genre.GenreRequestConverter;
import by.tryputs.bookssharing.converter.basic.genre.GenreResponseConverter;
import by.tryputs.bookssharing.dto.genre.GenreRequestDto;
import by.tryputs.bookssharing.dto.genre.GenreDto;
import by.tryputs.bookssharing.entity.Genre;
import by.tryputs.bookssharing.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenreService extends AbstractService<Genre, GenreRequestDto, GenreDto, GenreRepository, GenreRequestConverter, GenreResponseConverter> {

    @Autowired
    public GenreService(GenreRepository repository, GenreRequestConverter reqCon, GenreResponseConverter resCon) {
        super(repository, reqCon, resCon);
    }
}
