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
    public List<Carrera> buscarUno(String nombre) {
        List<Carrera> carreras = new ArrayList<>();
        for(Carrera carrera: this.carrerasRepositorio){
            if(carrera.getNombre().equals(nombre) ){
                carreras.add(carrera);
                break;
            }
        }
        return carreras;
    }

    @Override
    public List<Carrera> buscarTodos() {
        return this.carrerasRepositorio;
    }

    private boolean verificarNombre(String nombre){
        boolean encontrado = false;
        for(Carrera carrera: this.carrerasRepositorio){
            if (carrera.getNombre().equals(nombre)){
                encontrado = true;
                break;
            }
        }
        return  encontrado;
    }

    @Override
    public void crear(Carrera carrera) {
        if(!verificarNombre(carrera.getNombre())){
            this.carrerasRepositorio.add(carrera);
        }
    }

    private int buscarIndice(Carrera carrera){
        int indice = 0;
        for(Carrera carr: this.carrerasRepositorio  ){
            if(carr.getNombre().equals(carrera.getNombre())){
                break;
            }
            indice ++;
        }
        return indice;
    }

    // no se si se deberia poder modificar el nombre
    @Override
    public void modificar(Carrera carrera) {
        int indice = 0;
        if(verificarNombre(carrera.getNombre())){
            indice = buscarIndice(carrera);
            this.carrerasRepositorio.get(indice).setNombre(carrera.getNombre());
        }
    }

    @Override
    public void eliminar(Carrera carrera) {
        int indice = 0;
        for(Carrera carr: this.carrerasRepositorio){
            if(carr.getNombre().equals(carrera.getNombre())){
                indice = buscarIndice(carrera);
                this.carrerasRepositorio.remove(indice);
                break;
            }

        }
    }
}
