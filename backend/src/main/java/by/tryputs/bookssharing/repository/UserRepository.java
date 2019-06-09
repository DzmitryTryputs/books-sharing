package by.tryputs.bookssharing.repository;

import by.tryputs.bookssharing.entity.User;

public interface UserRepository extends AbstractRepository<User, Long> {

    User findByEmail(String email);
}
