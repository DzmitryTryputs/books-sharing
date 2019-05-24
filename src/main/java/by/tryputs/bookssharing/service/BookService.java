package by.tryputs.bookssharing.service;

import by.tryputs.bookssharing.converter.BookRequestConverter;
import by.tryputs.bookssharing.converter.BookResponseConverter;
import by.tryputs.bookssharing.converter.GenreRequestConverter;
import by.tryputs.bookssharing.converter.GenreResponseConverter;
import by.tryputs.bookssharing.dto.BookRequestDto;
import by.tryputs.bookssharing.dto.BookResponseDto;
import by.tryputs.bookssharing.entity.Book;
import by.tryputs.bookssharing.repository.BookRepository;
import by.tryputs.bookssharing.repository.GenreRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService extends AbstractService<Book, BookRequestDto, BookResponseDto, BookRepository, BookRequestConverter, BookResponseConverter> {

    @Autowired
    public BookService(BookRepository repository, BookRequestConverter reqCon, BookResponseConverter resCon) {
        super(repository, reqCon, resCon);
    }
}
