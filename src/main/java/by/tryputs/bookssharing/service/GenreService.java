package by.tryputs.bookssharing.service;

import by.tryputs.bookssharing.converter.GenreRequestConverter;
import by.tryputs.bookssharing.converter.GenreResponseConverter;
import by.tryputs.bookssharing.dto.GenreRequestDto;
import by.tryputs.bookssharing.dto.GenreResponseDto;
import by.tryputs.bookssharing.entity.Genre;
import by.tryputs.bookssharing.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenreService extends AbstractService<Genre, GenreRequestDto, GenreResponseDto, GenreRepository, GenreRequestConverter, GenreResponseConverter> {

    @Autowired
    public GenreService(GenreRepository repository, GenreRequestConverter reqCon, GenreResponseConverter resCon) {
        super(repository, reqCon, resCon);
    }
}
