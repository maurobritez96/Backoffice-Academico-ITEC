package ar.com.backoffice.servicio;

import ar.com.backoffice.modelo.Alumno;

public interface AlumnoServicio  extends CRUDServicio<Alumno>{
   Alumno buscarUno(String dni);

}
