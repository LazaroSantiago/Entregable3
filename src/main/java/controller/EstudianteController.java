package controller;

import entity.Estudiante;
import service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {
    @Autowired
    private EstudianteService estudianteService;

    @GetMapping("")
    public ResponseEntity<?> getEstudiantes() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(estudianteService.findAll());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente más tarde.\"}");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable long id) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(estudianteService.findById(id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente más tarde.\"}");
        }
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteById(@PathVariable long id) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(estudianteService.delete(id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente más tarde.\"}");
        }
    }

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody Estudiante entity) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(estudianteService.save(entity));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. No se pudo ingresar, revise los campos e intente nuevamente.\"}");
        }
    }

    @GetMapping("/genero/{genero}")
    public ResponseEntity<?> getAllByGender(@PathVariable char genero) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(estudianteService.getEstudiantesPorGenero(genero));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente más tarde.\"}");
        }
    }
}
