package controller;

import entity.Carrera;
import org.springframework.web.bind.annotation.*;
import service.CarreraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/carreras")
public class CarreraController {
    @Autowired
    private CarreraService carreraService;

    @GetMapping("/all")
    public ResponseEntity<?> findAll() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(carreraService.findAll());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. No se pudo ingresar, revise los campos e intente nuevamente.\"}");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable long id) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(carreraService.findById(id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. No se pudo ingresar, revise los campos e intente nuevamente.\"}");
        }
    }

    @GetMapping("/filtro1")
    public ResponseEntity<?> getCarrerasCantidadEstudiantes(){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(carreraService.getCarrerasPorCantidadEstudiantes());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. No se pudo ingresar, revise los campos e intente nuevamente.\"}");
        }
    }

    @PostMapping("/insert")
    public ResponseEntity<?> save(@RequestBody Carrera entity) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(carreraService.save(entity));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. No se pudo ingresar, revise los campos e intente nuevamente.\"}");
        }
    }

    @DeleteMapping("/D/{id}")
    public ResponseEntity<?> deleteById(@RequestBody Long id){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(carreraService.delete(id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. No se pudo ingresar, revise los campos e intente nuevamente.\"}");
        }
    }
}
