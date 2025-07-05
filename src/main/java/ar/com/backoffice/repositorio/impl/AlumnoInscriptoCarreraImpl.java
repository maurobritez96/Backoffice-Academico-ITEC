package ar.com.backoffice.repositorio.impl;

import ar.com.backoffice.modelo.AlumnoInscriptoCarrera;
import ar.com.backoffice.repositorio.AlumnoInscriptoCarreraRepositorio;
import ar.com.backoffice.repositorio.AlumnoRepositorio;
import ar.com.backoffice.repositorio.CarreraRepositorio;

import java.util.ArrayList;
import java.util.List;

public class AlumnoInscriptoCarreraImpl implements AlumnoInscriptoCarreraRepositorio {
    List<AlumnoInscriptoCarrera> alumnosInscriptosCarreraRepositorio;
    // importa estos repos para poder crear alumnosInscriptosCarrera
    AlumnoRepositorio alumnoRepositorio;
    CarreraRepositorio carreraRepositorio;

    public AlumnoInscriptoCarreraImpl(){
        this.alumnosInscriptosCarreraRepositorio = new ArrayList<>();
        this.alumnoRepositorio = new AlumnoRepositorioImpl();
        this.carreraRepositorio = new CarreraRepositorioImpl();
        cargarData();
    }

    private void cargarData(){
        // de mis 10 alumnos creados, 5 inscribo con la carrera de gastronomia y 5 con la de analista
        for(int i = 0; i<5; i++){
            this.alumnosInscriptosCarreraRepositorio.add(
                    new AlumnoInscriptoCarrera(alumnoRepositorio.buscarTodos().get(i), carreraRepositorio.buscarUno("Gastronomia").get(0))
            );
        }

        for(int i = 5; i<10; i++){
            this.alumnosInscriptosCarreraRepositorio.add(
                    new AlumnoInscriptoCarrera(alumnoRepositorio.buscarTodos().get(i), carreraRepositorio.buscarUno("Analista en sistemas").get(0))
            );
        }
    }


    @Override
    public List<AlumnoInscriptoCarrera> buscarUno(String dni) {
        List<AlumnoInscriptoCarrera> inscriptos = new ArrayList<>();
        for(AlumnoInscriptoCarrera inscripto: this.alumnosInscriptosCarreraRepositorio){
            if(inscripto.getAlumno().getDni().equals(dni)){
                inscriptos.add(inscripto);
                break;
            }
        }
        return inscriptos;
    }

    @Override
    public List<AlumnoInscriptoCarrera> buscarTodos() {
        return this.alumnosInscriptosCarreraRepositorio;
    }

    @Override
    public List<AlumnoInscriptoCarrera> buscarTodos(String nombreCarrera) {
        List<AlumnoInscriptoCarrera> inscriptos = new ArrayList<>();

        for(AlumnoInscriptoCarrera alumnoInscripto : this.alumnosInscriptosCarreraRepositorio){
            if(alumnoInscripto.getCarrera().getNombre().equals(nombreCarrera)){
                inscriptos.add(alumnoInscripto);
            }
        }
        return inscriptos;
    }

    private boolean verificarDni(String dni){
        boolean encontrado = false;
        for(AlumnoInscriptoCarrera inscripto: this.alumnosInscriptosCarreraRepositorio){
            if (inscripto.getAlumno().getDni().equals(dni)){
                encontrado = true;
                break;
            }
        }
        return  encontrado;
    }

    @Override
    public void crear(AlumnoInscriptoCarrera alumnoInscriptoCarrera) {
        if(!verificarDni(alumnoInscriptoCarrera.getAlumno().getDni())){
            this.alumnosInscriptosCarreraRepositorio.add(alumnoInscriptoCarrera);
        }
    }

    private int buscarIndice(AlumnoInscriptoCarrera alumnoInscriptoCarrera){
        int indice = 0;
        for(AlumnoInscriptoCarrera alumnoInscripto: this.alumnosInscriptosCarreraRepositorio  ){
            if(alumnoInscripto.getAlumno().getDni().equals(alumnoInscriptoCarrera.getAlumno().getDni())){
                break;
            }
            indice ++;
        }
        return indice;
    }

    @Override
    public void modificar(AlumnoInscriptoCarrera alumnoInscriptoCarrera) {
        // no deberia tener modificaciones
    }

    @Override
    public void eliminar(AlumnoInscriptoCarrera alumnoInscriptoCarrera) {
        int indice = 0;
        for(AlumnoInscriptoCarrera alumnoInscripto: this.alumnosInscriptosCarreraRepositorio){
            if(alumnoInscripto.getAlumno().getDni().equals(alumnoInscriptoCarrera.getAlumno().getDni())){
                indice = buscarIndice(alumnoInscripto);
                this.alumnosInscriptosCarreraRepositorio.remove(indice);
                break;
            }

        }
    }
}
