package controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.InscripcionService;

@RestController
@RequestMapping("/inscripciones")
public class InscripcionController {

    private InscripcionService inscripcionService;

    @GetMapping("/reporte")
    public ResponseEntity getReporte(){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(inscripcionService.getReporte());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. No se pudo ingresar, revise los campos e intente nuevamente.\"}");
        }
    }
}
