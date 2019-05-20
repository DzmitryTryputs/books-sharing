package by.tryputs.bookssharing.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "authors")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Author extends IdentifiableEntity {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "dob")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dob;

    @ManyToMany(mappedBy = "authors")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<Book> books = new ArrayList<>();
}
