package hibernate;

import javax.persistence.*;

/**
 * Created by Ufuk on 29-05-15.
 */
@Entity
@Table(name = "User")
public class User {

    @Id // Specifies the primary key property or filed of an entity
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString() {
        return "{ID: " + id + " Username: " + username + "}";
    }
}
