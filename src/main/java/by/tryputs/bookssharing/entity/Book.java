package by.tryputs.bookssharing.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "books")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Book extends IdentifiableEntity {

    @Column(name = "title", nullable = false, unique = true)
    private String title;

    @Column(name = "pages")
    private Long pages;

    @OneToMany(mappedBy = "book", cascade = {CascadeType.ALL})
    private List<SharingCard> sharingCards = new ArrayList<>();

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "books_genres",
            joinColumns = {@JoinColumn(name = "book_id")},
            inverseJoinColumns = {@JoinColumn(name = "genre_id")}
    )
    private List<Genre> genres = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "books_authors",
            joinColumns = {@JoinColumn(name = "book_id")},
            inverseJoinColumns = {@JoinColumn(name = "author_id")}
    )
    private List<Author> authors = new ArrayList<>();
}
