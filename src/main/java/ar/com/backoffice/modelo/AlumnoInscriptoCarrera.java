package ar.com.backoffice.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class AlumnoInscriptoCarrera {
    private Alumno alumno;
    private Carrera carrera;
    private List<MateriasAprobadas> materiasAprobadas;

    public AlumnoInscriptoCarrera(Alumno alumno, Carrera carrera){
        this.alumno = alumno;
        this.carrera = carrera;
        this.materiasAprobadas = new ArrayList<>();
    }

}

