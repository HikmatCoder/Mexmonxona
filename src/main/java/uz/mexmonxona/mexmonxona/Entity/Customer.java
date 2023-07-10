package uz.mexmonxona.mexmonxona.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Table( name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String FirstName;

    @Column(nullable = false)
    private String LastName;

    @Column(nullable = false)
    private LocalDate age;

    @Size(max = 20, min = 6)
    @NotNull
    @Column(nullable = true, unique = true)
    private String login;

    @Size(max = 60, min = 60)
    @NotNull
    @Column(nullable = true, unique = true)
    private String password;

    private Boolean active;

    public Customer(){

    }

    public Customer(Long id, String firstName, String lastName, LocalDate age, String login, String password, Boolean active) {
        this.id = id;
        FirstName = firstName;
        LastName = lastName;
        this.age = age;
        this.login = login;
        this.password = password;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public LocalDate getAge() {
        return age;
    }

    public void setAge(LocalDate age) {
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
