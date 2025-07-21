package ar.com.backoffice.servicio.impl;

import ar.com.backoffice.excepciones.NoEncontradoExcepcion;
import ar.com.backoffice.modelo.Alumno;
import ar.com.backoffice.repositorio.AlumnoRepositorio;
import ar.com.backoffice.repositorio.impl.AlumnoRepositorioImpl;
import ar.com.backoffice.servicio.AlumnoServicio;

import java.util.List;

public class AlumnoServicioImpl implements AlumnoServicio {

     private final AlumnoRepositorio alumnoRepositorio;

    public AlumnoServicioImpl() {
        this.alumnoRepositorio = new AlumnoRepositorioImpl();
    }


    @Override
    public Alumno buscarUno(String dni) {

        try{
            if(verificarDni(dni)){
                int indice = buscarIndice(dni);
                return  alumnoRepositorio.buscarUno(indice);
            }
            return null;

        }
        catch ( Exception e ){
            throw new NoEncontradoExcepcion("Alumno no encontrado");
        }
    }

    @Override
    public List<Alumno> buscarTodos() {
        return this.alumnoRepositorio.buscarTodos();
    }

    private boolean verificarDni(String dni){
        for( Alumno alu: this.alumnoRepositorio.buscarTodos()){
            if( alu.getDni().equals(dni)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void crear(Alumno alumno) {
        if(!verificarDni(alumno.getDni())){
            this.alumnoRepositorio.crear(alumno);
        }
    }



    @Override
    public void modificar(Alumno alumno) {
            if(verificarDni(alumno.getDni())){
                int indice = buscarIndice(alumno.getDni());
                this.alumnoRepositorio.modificar(indice,alumno);
            }
    }

    private  int buscarIndice(String dni){
        int indice = 0;
        for( Alumno alu: this.alumnoRepositorio.buscarTodos()  ){
            if(alu.getDni().equals(dni)){
                break;
            }
            indice++;
        }
        return indice;
    }

    @Override
    public void eliminar(Alumno alumno) {
        for(Alumno alu: this.alumnoRepositorio.buscarTodos()){
            if(alu.getDni().equals(alumno.getDni())){
                int indice = buscarIndice(alu.getDni());
                this.alumnoRepositorio.eliminar(indice);
            }
        }
    }
}




