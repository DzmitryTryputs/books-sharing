package by.tryputs.bookssharing.service;

import by.tryputs.bookssharing.converter.basic.book.BookRequestConverter;
import by.tryputs.bookssharing.converter.basic.book.BookResponseConverter;
import by.tryputs.bookssharing.dto.book.BookRequestDto;
import by.tryputs.bookssharing.dto.book.BookDto;
import by.tryputs.bookssharing.entity.Book;
import by.tryputs.bookssharing.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService extends AbstractService<Book, BookRequestDto, BookDto, BookRepository, BookRequestConverter, BookResponseConverter> {

    @Autowired
    public BookService(BookRepository repository, BookRequestConverter reqCon, BookResponseConverter resCon) {
        super(repository, reqCon, resCon);
    }
}
