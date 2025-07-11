package ar.com.backoffice.repositorio;

import ar.com.backoffice.modelo.Materia;
import ar.com.backoffice.modelo.Profesor;

import java.util.List;

public interface MateriaRepositorio extends CRUDRepositorio<Materia> {
    List<Materia> buscarUno(String codigo);
    void agregarProfesor(Materia materia, Profesor profesor);
    void agregarCorrelativas(Materia materia, List<Materia> correlativas);
}
