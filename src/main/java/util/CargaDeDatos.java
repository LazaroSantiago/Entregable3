package util;


import DTO.CarreraDTO;
import entity.Carrera;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import repository.CarreraRepository;

import java.util.ArrayList;
import java.util.List;

@Component
public class CargaDeDatos {

    private final CarreraRepository carreraRepository;

    @Autowired
    public CargaDeDatos(CarreraRepository carreraRepository) {
        this.carreraRepository = carreraRepository;
    }

    public void cargarDatosDesdeCSV() {
        Carrera carrera = new Carrera("TUDAI");
        System.out.println(carrera);
//        carreraRepository.save(carrera);
        List<CarreraDTO> test = carreraRepository.getCarrerasPorCantidadEstudiantes();
        System.out.println(test.isEmpty());
    }
}
