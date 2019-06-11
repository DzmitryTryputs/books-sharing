package by.tryputs.bookssharing.repository;

import by.tryputs.bookssharing.entity.User;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends AbstractRepository<User, Long> {

    User findByEmail(String email);

    @Query("select u.id from User u where u.email = ?1")
    Long getIdByEmail(final String email);
}
