package by.tryputs.bookssharing.repository;

import by.tryputs.bookssharing.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}