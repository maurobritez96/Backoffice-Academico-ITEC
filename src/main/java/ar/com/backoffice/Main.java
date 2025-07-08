package ar.com.backoffice;

import ar.com.backoffice.modelo.Alumno;
import ar.com.backoffice.modelo.AlumnoInscriptoCarrera;
import ar.com.backoffice.modelo.Carrera;
import ar.com.backoffice.repositorio.AlumnoInscriptoCarreraRepositorio;
import ar.com.backoffice.repositorio.AlumnoRepositorio;
import ar.com.backoffice.repositorio.CarreraRepositorio;
import ar.com.backoffice.repositorio.impl.AlumnoInscriptoCarreraImpl;
import ar.com.backoffice.repositorio.impl.AlumnoRepositorioImpl;
import ar.com.backoffice.repositorio.impl.CarreraRepositorioImpl;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AlumnoRepositorio alumnoRepo = new AlumnoRepositorioImpl();
        CarreraRepositorio carreraRepo = new CarreraRepositorioImpl();
        AlumnoInscriptoCarreraRepositorio alumnoInscripto = new AlumnoInscriptoCarreraImpl();

//        for(Alumno alumno : alumnoRepo.buscarTodos()){
//            System.out.println(alumno.getNombre() + " " +  alumno.getApellido());
//            System.out.println("---------------------------------------");
//        }

        System.out.println(alumnoRepo.buscarTodos().stream().count());

        //crear un alumno nuevo
        Alumno julio = new Alumno("Julio", "Argentino Roca", "47426591", "3765050155", "julio@gmail.com", "Itec 1");
        alumnoRepo.crear(julio);


        System.out.println(alumnoRepo.buscarUno("47426591"));
        System.out.println(alumnoRepo.buscarTodos().stream().count());

        //ahora inscribir a julio a la carrera de gatronomia
        AlumnoInscriptoCarrera alumnoinscripto1 = new AlumnoInscriptoCarrera(julio, carreraRepo.buscarUno("Gastronomia").get(0));
        alumnoInscripto.crear(alumnoinscripto1);// esto agrega a la base de datos
        //fijarme si julio esta inscripto a la carrera

        alumnoInscripto.buscarUno("47426591");

        //listar todos los alumnos de la carrera
        for (AlumnoInscriptoCarrera alumnoIns : alumnoInscripto.buscarTodos("Gastronomia")) {
            System.out.println(alumnoIns.getAlumno().getNombre());
            System.out.println("-------------------------------------");

        }
    }
}


