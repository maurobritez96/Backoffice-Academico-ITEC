package ar.com.backoffice;


import ar.com.backoffice.modelo.Carrera;
import ar.com.backoffice.modelo.Materia;
import ar.com.backoffice.repositorio.*;
import ar.com.backoffice.repositorio.impl.*;
import ar.com.backoffice.servicio.AlumnoServicio;
import ar.com.backoffice.servicio.impl.AlumnoServicioImpl;

public class Main {
    public static void main(String[] args) {
        /*ProfesorRepositorio profesorRepositorio = new ProfesorRepositorioImpl();
        CarreraRepositorio carreraRepositorio = new CarreraRepositorioImpl();
        CicloLectivoRepositorio cicloLectivoRepositorio = new CicloLectivoRepositorioImpl();
        MateriaRepositorio materiaRepositorio = new MateriaRepositorioImpl();


//        System.out.println("materias: " + materiaRepositorio.buscarTodos());
        Materia lenguaje2 = materiaRepositorio.buscarUno("as20len2").get(0);
        System.out.println("codigo: " + lenguaje2.getCodigo());
        System.out.println("nombre: " + lenguaje2.getNombre());
        System.out.println("ciclo lectivo: " + lenguaje2.getCicloLectivo().getAno());
        System.out.println("correlativas: " + lenguaje2.getCorrelativas());
        System.out.println("profesor: " + lenguaje2.getProfesor().getNombre() + " " + lenguaje2.getProfesor().getApellido());*/

        AlumnoServicio alumnoServicio = new AlumnoServicioImpl();

        alumnoServicio.buscarUno("12248438589859843894384848439438585");
        AlumnoRepositorio alumnoRepositorio = new AlumnoRepositorioImpl();

       // alumnoRepositorio.buscarUno("12248438589859843894384848439438585").get(0);

    }
}


