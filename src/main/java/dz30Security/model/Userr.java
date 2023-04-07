package dz30Security.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Userr")
@Getter
@Setter
public class Userr {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String password;
    private String username;

    private String email;
    @Column(name = "role")
    private String role = "ROLE_USER";
    private String login;


    public Userr() {
    }

    public Userr(String password, String username, String email, String role, String login) {
        this.password = password;
        this.username = username;
        this.email = email;
        this.role = role;
        this.login = login;
    }
}