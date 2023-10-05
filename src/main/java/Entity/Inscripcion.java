package Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.Period;

@Entity
@Data
public class Inscripcion {
    @ManyToOne( cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinColumn(name = "numero_legajo")
    private Estudiante estudiante;

    @ManyToOne( cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinColumn(name = "id_carrera")
    private Carrera carrera;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_inscripcion;

    @Column(name = "fecha_de_inicio")
    private LocalDate fechaInicio;

    @Column(name = "es_graduado")
    private boolean esGraduado = false;


    public Inscripcion() {
        super();
        this.fechaInicio = LocalDate.now();
    }

    public Inscripcion(Estudiante estudiante, Carrera carrera) {
        this();
        this.estudiante = estudiante;
        this.carrera = carrera;
    }

    public int getAniosAntiguedad() {
        Period p = Period.between(this.fechaInicio, LocalDate.now());
        return p.getYears();
    }

}
