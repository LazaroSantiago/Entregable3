package Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Carrera {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_carrera;

    @OneToMany(mappedBy = "carrera", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Inscripcion> inscripciones;

    @Column
    private String nombre;

    public Carrera(){
        super();
    }

    public Carrera(String nombre) {
        super();
        this.nombre = nombre;
        this.inscripciones = new HashSet<>();
    }
}
