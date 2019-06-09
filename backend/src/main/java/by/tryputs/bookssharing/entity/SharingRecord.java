package by.tryputs.bookssharing.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "records")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class SharingRecord extends IdentifiableEntity {

    @ManyToOne
    @JoinColumn(name = "card_id", nullable = false)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private SharingCard sharingCard;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private User receiver;

    @Column(name = "receive_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate receiveDate;

    @Column(name = "return_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate returnDate;
}
