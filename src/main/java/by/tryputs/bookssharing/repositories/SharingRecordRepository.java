package by.tryputs.bookssharing.repositories;

import by.tryputs.bookssharing.entities.SharingRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SharingRecordRepository extends JpaRepository<SharingRecord, Long> {
}
