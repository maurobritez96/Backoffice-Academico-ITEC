package ar.com.backoffice.repositorio;

import ar.com.backoffice.modelo.Materia;

import java.util.List;

public interface MateriaRepositorio extends CRUDRepositorio<Materia> {
    List<Materia> buscarUno(String codigo);
}
