package ar.com.backoffice.controlador;

import ar.com.backoffice.modelo.Alumno;
import ar.com.backoffice.servicio.AlumnoServicio;
import ar.com.backoffice.servicio.impl.AlumnoServicioImpl;

import java.util.List;

public class AlumnoControlador {

   private  AlumnoServicio alumnoServicio;

    public AlumnoControlador(){
        this.alumnoServicio = new AlumnoServicioImpl();
    }

    public List<Alumno> buscarTodos(){
        return alumnoServicio.buscarTodos();
    }

    public Alumno buscarUno(Alumno alumno){
        return  this.alumnoServicio.buscarUno(alumno.getDni());
    }

    public void modificar(Alumno alumno){
        this.alumnoServicio.modificar(alumno);
    }

    public void crear(Alumno alumno){
        this.alumnoServicio.crear(alumno);
    }

    public void eliminar(Alumno alumno){
        this.alumnoServicio.eliminar(alumno);
    }

}
