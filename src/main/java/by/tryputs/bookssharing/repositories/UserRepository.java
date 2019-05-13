package by.tryputs.bookssharing.repositories;

import by.tryputs.bookssharing.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
