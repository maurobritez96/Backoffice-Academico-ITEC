package ar.com.backoffice.servicio.impl;

import ar.com.backoffice.excepciones.NoEncontradoExcepcion;
import ar.com.backoffice.modelo.Alumno;
import ar.com.backoffice.modelo.Carrera;
import ar.com.backoffice.repositorio.CarreraRepositorio;
import ar.com.backoffice.repositorio.impl.CarreraRepositorioImpl;
import ar.com.backoffice.servicio.CarreraServicio;

import java.util.List;

public class CarreraServicioImpl implements CarreraServicio {

    CarreraRepositorio carreraRepositorio;

    public CarreraServicioImpl(){
        this.carreraRepositorio = new CarreraRepositorioImpl();
    }

    @Override
    public Carrera buscarUno(String nombre) {
        try{
            if(verificarNombre(nombre)){
                int indice = buscarIndice(nombre);
                return  carreraRepositorio.buscarUno(indice);
            }
            return null;

        }
        catch ( Exception e ){
            throw new NoEncontradoExcepcion("Carrera no encontrada");
        }
    }

    @Override
    public List<Carrera> buscarTodos() {
        return this.carreraRepositorio.buscarTodos();
    }

    @Override
    public void crear(Carrera carrera) {
        if(!verificarNombre(carrera.getNombre())){
            this.carreraRepositorio.crear(carrera);
        }
    }

    @Override
    public void modificar(Carrera carrera) {
        if(verificarNombre(carrera.getNombre())){
            int indice = buscarIndice(carrera.getNombre());
            this.carreraRepositorio.modificar(indice,carrera);
        }
    }

    @Override
    public void eliminar(Carrera carrera) {
        for(Carrera carre: this.carreraRepositorio.buscarTodos()){
            if(carre.getNombre().equals(carrera.getNombre())){
                int indice = buscarIndice(carre.getNombre());
                this.carreraRepositorio.eliminar(indice);
            }
        }
    }

    private boolean verificarNombre(String nombre){
        for( Carrera carrera: this.carreraRepositorio.buscarTodos()){
            if( carrera.getNombre().equals(nombre)){
                return true;
            }
        }
        return false;
    }

    private  int buscarIndice(String nombre){
        int indice = 0;
        for( Carrera carrera: this.carreraRepositorio.buscarTodos() ){
            if(carrera.getNombre().equals(nombre)){
                break;
            }
            indice++;
        }
        return indice;
    }


}
