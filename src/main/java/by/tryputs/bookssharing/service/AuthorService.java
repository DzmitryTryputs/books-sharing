package by.tryputs.bookssharing.service;

import by.tryputs.bookssharing.converter.AuthorRequestConverter;
import by.tryputs.bookssharing.converter.AuthorResponseConverter;
import by.tryputs.bookssharing.dto.AuthorRequestDto;
import by.tryputs.bookssharing.dto.AuthorResponseDto;
import by.tryputs.bookssharing.entity.Author;
import by.tryputs.bookssharing.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService extends AbstractService<Author, AuthorRequestDto, AuthorResponseDto, AuthorRepository, AuthorRequestConverter, AuthorResponseConverter> {

    @Autowired
    public AuthorService(AuthorRepository repository, AuthorRequestConverter reqCon, AuthorResponseConverter resCon) {
        super(repository, reqCon, resCon);
    }
}
