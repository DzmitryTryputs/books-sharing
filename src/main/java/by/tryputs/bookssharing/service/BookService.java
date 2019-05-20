package by.tryputs.bookssharing.service;

import by.tryputs.bookssharing.entity.Book;
import by.tryputs.bookssharing.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BookService {

    private BookRepository bookRepository;

    public void addBook(Book book) {
        bookRepository.save(book);
    }
}
