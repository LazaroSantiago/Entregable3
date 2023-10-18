package DTO;

import lombok.Data;

import java.time.LocalDate;

@Data
public class InscripcionDTO {

    private String nombreCarrera;

    private LocalDate fechaInicio;
    private boolean esGraduado;

    private long numeroLegajoEstudiante;
    private String nombreCompletoEstudiante;
    private char generoEstudiante;

    public InscripcionDTO(){
        super();
    }
    public InscripcionDTO(String nombreCarrera, LocalDate fechaInicio, boolean esGraduado,
                          long numeroLegajoEstudiante, String nombreCompletoEstudiante, char generoEstudiante ){
        this.nombreCarrera = nombreCarrera;
        this.fechaInicio = fechaInicio;
        this.esGraduado = esGraduado;
        this.generoEstudiante = generoEstudiante;
        this.nombreCompletoEstudiante = nombreCompletoEstudiante;
        this.numeroLegajoEstudiante = numeroLegajoEstudiante;
    }
}
