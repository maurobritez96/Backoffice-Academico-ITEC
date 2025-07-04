package ar.com.backoffice.repositorio;

import ar.com.backoffice.modelo.Alumno;
import ar.com.backoffice.securirty.repository.CRUDRepository;

import java.util.List;

public interface AlumnoRepositorio extends CRUDRepositorio<Alumno> {

    List<Alumno> buscarUno(String dni);

}
