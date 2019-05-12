package by.tryputs.bookssharing.services.impl;

import by.tryputs.bookssharing.entities.Book;
import by.tryputs.bookssharing.repositories.BookRepository;
import by.tryputs.bookssharing.services.BookService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    @Override
    public void addBook(Book book) {
        bookRepository.save(book);
    }
}
