package by.tryputs.bookssharing.repository;

import by.tryputs.bookssharing.entity.VerificationTokenDbo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VerificationTokenRepository extends JpaRepository<VerificationTokenDbo, Long> {

    Optional<VerificationTokenDbo> findByToken(String token);

    void deleteByToken(String token);
}
