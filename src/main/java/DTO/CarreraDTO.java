package DTO;

import lombok.Data;

@Data
public class CarreraDTO {
    private String nombre;
    private int cantEstudiantes;

    public CarreraDTO() {
        super();
    }

    public CarreraDTO(String nombre) {
        this.nombre = nombre;
    }

    public CarreraDTO(String nombre, int cantEstudiantes) {
        this.nombre = nombre;
        this.cantEstudiantes = cantEstudiantes;
    }

}
