package by.tryputs.bookssharing.repository;

import by.tryputs.bookssharing.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends AbstractRepository<Author, Long> {
}
