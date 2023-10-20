package DTO;

import lombok.Data;

import java.math.BigInteger;

@Data
public class CarreraDTO {
    private String nombre;
    private Long cantEstudiantes;

    public CarreraDTO() {
        super();
    }

    public CarreraDTO(String nombre) {
        this.nombre = nombre;
    }

    public CarreraDTO(String nombre, long cantEstudiantes) {
        this.nombre = nombre;
        this.cantEstudiantes = cantEstudiantes;
    }

}
