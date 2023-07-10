package uz.mexmonxona.mexmonxona.Entity;

import javax.persistence.*;

@Entity
@Table(name = "servants")
public class Servant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String FirstName;

    @Column(nullable = false)
    private String LastName;

    private String duty;

    private Boolean active;

}
