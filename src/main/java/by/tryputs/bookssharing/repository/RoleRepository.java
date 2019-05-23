package by.tryputs.bookssharing.repository;

import by.tryputs.bookssharing.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends AbstractRepository<Role, Long> {

    Role findByName(String name);
}