package ar.com.backoffice.servicio;

import ar.com.backoffice.modelo.Carrera;

public interface CarreraServicio extends CRUDServicio<Carrera>{
    Carrera buscarUno(String nombre);

}
