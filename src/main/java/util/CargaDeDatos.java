package util;


import entity.Carrera;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import repository.CarreraRepository;

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
        carreraRepository.save(carrera);
    }
}
