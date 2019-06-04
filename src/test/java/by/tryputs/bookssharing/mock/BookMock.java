package by.tryputs.bookssharing.mock;

import by.tryputs.bookssharing.dto.book.BookDto;
import by.tryputs.bookssharing.dto.book.BookRequestDto;
import by.tryputs.bookssharing.entity.Book;

public class BookMock {

    private static final String TITLE = "bookTitle";
    private static final Long PAGES = 100L;

    public static Book getBookDboMock() {
        Book book = new Book();
        book.setTitle(TITLE);
        book.setPages(PAGES);
        book.setId(1L);

        return book;
    }

    public static BookDto getBookDtoMock() {
        BookDto book = new BookDto();
        book.setTitle(TITLE);
        book.setPages(PAGES);
        book.setId(1L);

        return book;
    }

    public static BookRequestDto getBookRequestDtoMock() {
        BookRequestDto book = new BookRequestDto();
        book.setTitle(TITLE);
        book.setPages(PAGES);

        return book;
    }
}
