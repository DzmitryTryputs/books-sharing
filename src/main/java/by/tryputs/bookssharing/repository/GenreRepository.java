package by.tryputs.bookssharing.repository;

import by.tryputs.bookssharing.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}
