package Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Inscripcion {
    @Id
    private long id_inscripcion;

    @Column
    private int id_estudiante;

    @Column
    private int id_carrera;

    @Column
    private LocalDate fechaInicio;

    @Column
    private boolean esGraduado = false;

    public Inscripcion(){

    }
}
