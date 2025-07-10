package ar.com.backoffice.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Materia {
    private String codigo;
    private String nombre;
//    private List<AlumnoInscriptoMateria> alumnosInscriptos;
    private Profesor profesor;
    private List<Materia> correlativas;
    //falta la asistencia, horario

    public Materia(String codigo, String nombre){
        this.codigo = codigo;
        this.nombre = nombre;
//        this.alumnosInscriptos = new ArrayList<>();
        this.correlativas = new ArrayList<>();
    }
}

