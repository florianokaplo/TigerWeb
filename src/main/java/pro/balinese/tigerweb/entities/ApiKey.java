package pro.balinese.tigerweb.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "apikeys")
public class ApiKey {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String key;
    private String description;
}
