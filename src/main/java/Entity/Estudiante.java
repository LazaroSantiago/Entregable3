package Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Estudiante {
    @Id
    private int numeroLegajo;

    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private int edad;
    @Column
    private char genero;
    @Column
    private String ciudad;
    @Column(unique = true)
    private int dni;

    @OneToMany(mappedBy = "estudiante", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Inscripcion> inscripciones;

    public Estudiante(){
        super();
    }

    public void addInscripcion(Inscripcion inscripcion){
        this.inscripciones.add(inscripcion);
    }

    public Set<Inscripcion> getInscripciones(){
        return new HashSet<>(inscripciones);
    }
}