package ar.com.backoffice.repositorio;

import ar.com.backoffice.modelo.Profesor;

import java.util.List;

public interface ProfesorRepositorio extends CRUDRepositorio<Profesor> {
    List<Profesor> buscarUno(String matricula);

}
