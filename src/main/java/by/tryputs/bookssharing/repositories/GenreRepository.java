package by.tryputs.bookssharing.repositories;

import by.tryputs.bookssharing.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}
