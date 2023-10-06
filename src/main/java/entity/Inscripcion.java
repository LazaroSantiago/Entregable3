package entity;

import lombok.Data;
import java.time.LocalDate;
import jakarta.persistence.*;
import org.springframework.web.bind.annotation.InitBinder;

import java.time.Period;

@Entity
@Data
public class Inscripcion {

    @ManyToOne(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    }, fetch = FetchType.LAZY)
    @JoinColumn(name = "legajo_estudiante")
    private Estudiante estudiante;

    @ManyToOne(cascade = {
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

//    @InitBinder
//    public void initBinder(WebDataBinder binder) {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yourdateformat"); //yyyy-MM-dd'T'HH:mm:ssZ example
//        dateFormat.setLenient(false);
//        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
//    }

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
