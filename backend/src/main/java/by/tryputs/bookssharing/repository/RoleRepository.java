package by.tryputs.bookssharing.repository;

import by.tryputs.bookssharing.entity.Role;

public interface RoleRepository extends AbstractRepository<Role, Long> {

    Role findByName(String name);
}