package ma.octo.training;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private Clubs club;

    protected Player() {
    }

    public Player(String firstName, String lastName, Clubs club) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.club = club;
    }

    @Override
    public String toString() {
        return String.format(
                "Player[id=%d, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Clubs getClub() {
        return club;
    }
}