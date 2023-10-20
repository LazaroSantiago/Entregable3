package DTO;

import lombok.Data;

@Data
public class EstudianteDTO {
    private Long numeroLegajo;
    private String nombreCompleto;
    private String ciudad;
    private char genero;

    public EstudianteDTO(){
        super();
    }

    public EstudianteDTO(Long numeroLegajo, String nombre, String apellido){
        this.numeroLegajo = numeroLegajo;
        this.nombreCompleto = nombre + ", " + apellido;
    }

    public EstudianteDTO(String nombreCompleto, String ciudad, char genero, Long numeroLegajo){
        this.nombreCompleto = nombreCompleto;
        this.ciudad = ciudad;
        this.genero = genero;
        this.numeroLegajo = numeroLegajo;
    }

    public EstudianteDTO(String nombre, String apellido, String ciudad, char genero, Long numeroLegajo){
        this.setNombreCompleto(nombre, apellido);
        this.ciudad = ciudad;
        this.genero = genero;
        this.numeroLegajo = numeroLegajo;
    }

    public void setNombreCompleto(String nombreCompleto){
        this.nombreCompleto = nombreCompleto;
    }

    public void setNombreCompleto(String nombre, String apellido) {
        this.nombreCompleto = apellido +", "+nombre;
    }
}
