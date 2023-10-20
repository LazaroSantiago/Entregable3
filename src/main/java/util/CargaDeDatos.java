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
//        Carrera carrera2 = new Carrera("sistemas");
//        System.out.println(carrera);
//        carreraController.save(carrera);
//        carreraController.save(carrera2);
//
//        List<CarreraDTO> test = carreraRepository.getCarrerasPorCantidadEstudiantes();
//        System.out.println(test.isEmpty());
    }
}
