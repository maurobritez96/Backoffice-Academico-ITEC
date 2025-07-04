package ar.com.backoffice.repositorio;

import ar.com.backoffice.modelo.Carrera;

import java.util.List;

public interface CarreraRepositorio extends CRUDRepositorio<Carrera>{
    List<Carrera> buscarUno(String nombre);

}
