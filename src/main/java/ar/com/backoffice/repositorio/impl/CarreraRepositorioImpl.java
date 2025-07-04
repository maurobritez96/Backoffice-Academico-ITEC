package ar.com.backoffice.repositorio.impl;

import ar.com.backoffice.modelo.Carrera;
import ar.com.backoffice.repositorio.CarreraRepositorio;

import java.util.ArrayList;
import java.util.List;

public class CarreraRepositorioImpl implements CarreraRepositorio {

    List<Carrera> carrerasRepositorio;

    public CarreraRepositorioImpl(){
        this.carrerasRepositorio = new ArrayList<>();
    }

    private void cargarData(){

    }


    @Override
    public List<Carrera> buscarUno(String nombre) {
        return List.of();
    }

    @Override
    public List<Carrera> buscarTodos() {
        return List.of();
    }

    @Override
    public void crear(Carrera carrera) {

    }

    @Override
    public void modificar(Carrera carrera) {

    }

    @Override
    public void eliminar(Carrera carrera) {

    }
}
