package uz.mexmonxona.mexmonxona.Entity;

import javax.persistence.*;

@Entity
@Table(name = "rooms")
public class Building {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;




}
