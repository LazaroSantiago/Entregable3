package util;


import DTO.CarreraDTO;
import controller.CarreraController;
import entity.Carrera;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import repository.CarreraRepository;

import java.util.ArrayList;
import java.util.List;

@Component
public class CargaDeDatos {

    private final CarreraController carreraController;

    @Autowired
    public CargaDeDatos(CarreraController carreraController) {
        this.carreraController = carreraController;
    }

    public void cargarDatos() {
//        Carrera carrera = new Carrera("TUDAI");
//        System.out.println(carrera);
//        carreraRepository.save(carrera);
//        carreraController.findById(102L);
//        List<CarreraDTO> test = carreraRepository.getCarrerasPorCantidadEstudiantes();
//        System.out.println(test.isEmpty());
    }
}
