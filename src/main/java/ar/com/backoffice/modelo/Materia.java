package ar.com.backoffice.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Materia {
    private String nombre;
    private List<AlumnoInscriptoMateria> alumnosInscriptos;
    private Profesor profesor;
    //falta la asistencia, horario,corelativas

    public Materia(){
        this.alumnosInscriptos = new ArrayList<>();
    }
}

