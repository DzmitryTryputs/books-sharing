package by.tryputs.bookssharing.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "genres")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Genre extends IdentifiableEntity {

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @ManyToMany(mappedBy = "genres")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<Book> books = new ArrayList<>();
}
