package test;

import entity.Carrera;
import repository.CarreraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mili {
    private final CarreraRepository carreraRepository;

    @Autowired
    public Mili(CarreraRepository carreraRepository){
        this.carreraRepository = carreraRepository;
    }

    public void doStuff(){
        Carrera carrera = new Carrera(0L, "TUDAI");
        System.out.println(carrera);
        carreraRepository.save(carrera);
    }
}
