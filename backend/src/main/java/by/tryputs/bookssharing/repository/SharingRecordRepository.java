package by.tryputs.bookssharing.repository;

import by.tryputs.bookssharing.entity.SharingRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SharingRecordRepository extends AbstractRepository<SharingRecord, Long> {
}
