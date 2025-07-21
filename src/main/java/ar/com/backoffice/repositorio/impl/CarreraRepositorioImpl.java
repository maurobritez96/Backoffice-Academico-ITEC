package ar.com.backoffice.repositorio.impl;

import ar.com.backoffice.modelo.Carrera;
import ar.com.backoffice.repositorio.CarreraRepositorio;

import java.util.ArrayList;
import java.util.List;

public class CarreraRepositorioImpl implements CarreraRepositorio {

    List<Carrera> carrerasRepositorio;

    public CarreraRepositorioImpl(){
        this.carrerasRepositorio = new ArrayList<>();
        cargarData();
    }

    private void cargarData(){
        this.carrerasRepositorio.add(new Carrera("Gastronomia"));
        this.carrerasRepositorio.add(new Carrera("Analista en sistemas"));
    }


    @Override
    public Carrera buscarUno(int indice) {
        return this.carrerasRepositorio.get(indice);
    }

    @Override
    public List<Carrera> buscarTodos() {
        return this.carrerasRepositorio;
    }


    @Override
    public void crear(Carrera carrera) {
        this.carrerasRepositorio.add(carrera);
    }




    @Override
    public void modificar( int indice, Carrera carrera) {
        this.carrerasRepositorio.get(indice).setNombre(carrera.getNombre());
    }

    @Override
    public void eliminar(int indice) {
        this.carrerasRepositorio.remove(indice);
    }
}
