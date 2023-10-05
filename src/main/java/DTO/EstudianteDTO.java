package DTO;

import Entity.Estudiante;
import lombok.Data;

@Data
public class EstudianteDTO {
    private int numeroLegajo;
    private String nombreCompleto;

    public EstudianteDTO(){
        super();
    }

    public EstudianteDTO(int numeroLegajo, String nombre, String apellido){
        this.numeroLegajo = numeroLegajo;
        this.nombreCompleto = nombre + ", " + apellido;
    }
}
