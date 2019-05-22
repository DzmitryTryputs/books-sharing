package by.tryputs.bookssharing.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class User extends IdentifiableEntity {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @ManyToMany(mappedBy = "users", cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @EqualsAndHashCode.Exclude
    private List<Role> roles = new ArrayList<>();

    @OneToMany(mappedBy = "owner", cascade = {CascadeType.ALL})
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<SharingCard> sharingCards = new ArrayList<>();

    @OneToMany(mappedBy = "receiver", cascade = {CascadeType.ALL})
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<SharingRecord> sharingRecords = new ArrayList<>();
}
