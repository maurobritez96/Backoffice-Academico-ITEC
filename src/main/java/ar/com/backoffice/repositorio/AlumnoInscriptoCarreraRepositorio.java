package ar.com.backoffice.repositorio;

import ar.com.backoffice.modelo.AlumnoInscriptoCarrera;

import java.util.List;

public interface AlumnoInscriptoCarreraRepositorio extends CRUDRepositorio<AlumnoInscriptoCarrera>{
    List<AlumnoInscriptoCarrera> buscarTodos(String nombreCarrera);
    List<AlumnoInscriptoCarrera> buscarUno(String dni);
}
