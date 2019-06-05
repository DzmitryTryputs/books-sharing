package by.tryputs.bookssharing.service;

import by.tryputs.bookssharing.converter.basic.author.AuthorRequestConverter;
import by.tryputs.bookssharing.converter.basic.author.AuthorResponseConverter;
import by.tryputs.bookssharing.dto.author.AuthorRequestDto;
import by.tryputs.bookssharing.dto.author.AuthorDto;
import by.tryputs.bookssharing.entity.Author;
import by.tryputs.bookssharing.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService extends AbstractService<Author, AuthorRequestDto, AuthorDto, AuthorRepository, AuthorRequestConverter, AuthorResponseConverter> {

    @Autowired
    public AuthorService(AuthorRepository repository, AuthorRequestConverter reqCon, AuthorResponseConverter resCon) {
        super(repository, reqCon, resCon);
    }
}
