package repository;

import DTO.EstudianteDTO;
import entity.Estudiante;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("EstudianteRepository")
public interface EstudianteRepository extends BaseRepository<Estudiante, Long> {
    //todo: queries

    List<Estudiante> getEstudianteByNumeroLegajo(int nuemeroLegajo);

    @Query("SELECT e FROM Estudiante e " +
            "ORDER BY e.numeroLegajo DESC ")
    List<Estudiante> getEstudiantes();

    @Query("SELECT e FROM Estudiante e " +
            "ORDER BY e.numeroLegajo ASC ")
    List<Estudiante> getEstudiantesAscendente();

    @Query("SELECT new DTO.EstudianteDTO(e.nombre, e.apellido, e.ciudad, e.genero, e.numeroLegajo) " +
           "FROM Estudiante e " +
           "WHERE e.genero LIKE :genero")
    List<EstudianteDTO> getEstudiantesByGenero(@Param("genero")char genero);
}
