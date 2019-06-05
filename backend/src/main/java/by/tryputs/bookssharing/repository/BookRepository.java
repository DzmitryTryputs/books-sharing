package by.tryputs.bookssharing.repository;

import by.tryputs.bookssharing.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends AbstractRepository<Book, Long> {
}
