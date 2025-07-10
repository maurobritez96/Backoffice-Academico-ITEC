package ar.com.backoffice.repositorio.impl;

import ar.com.backoffice.modelo.Materia;
import ar.com.backoffice.repositorio.MateriaRepositorio;

import java.util.ArrayList;
import java.util.List;

public class MateriaRepositorioImpl implements MateriaRepositorio {
    List<Materia> materiasRepositorio;

    public MateriaRepositorioImpl(){
        this.materiasRepositorio = new ArrayList<>();
    }

    @Override
    public List<Materia> buscarTodos() {
        return List.of();
    }

    @Override
    public void crear(Materia materia) {

    }

    @Override
    public void modificar(Materia materia) {

    }

    @Override
    public void eliminar(Materia materia) {

    }

    @Override
    public List<Materia> buscarUno(String codigo) {
        return List.of();
    }
}
