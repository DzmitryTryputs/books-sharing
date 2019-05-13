package by.tryputs.bookssharing.repositories;

import by.tryputs.bookssharing.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
