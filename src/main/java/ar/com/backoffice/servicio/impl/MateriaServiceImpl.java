package ar.com.backoffice.servicio.impl;

import ar.com.backoffice.modelo.AlumnoInscriptoCarrera;
import ar.com.backoffice.modelo.Carrera;
import ar.com.backoffice.modelo.Materia;
import ar.com.backoffice.repositorio.CarreraRepositorio;
import ar.com.backoffice.servicio.MateriaService;

import java.util.List;

public class MateriaServiceImpl implements MateriaService {

    private final CarreraRepositorio carreraRepositorio;

    public MateriaServiceImpl(CarreraRepositorio carreraRepositorio) {
        this.carreraRepositorio = carreraRepositorio;
    }


    @Override
    public List<Materia> buscarTodos() {
        return List.of();
    }

    @Override
    public void crear(Materia materia) {

    }

    @Override
    public void modificar(Materia materia) {

    }

    @Override
    public void eliminar(Materia materia) {

    }

    @Override
    public Materia registrarAlumno(AlumnoInscriptoCarrera alumnoInscriptoCarrera, String nombreCarrera, String ano, String nombreMateria) {
        // busqueda anidada, si existe todo
        // fijarse si el alumno esta inscripto a la carrera
        // termina guardando un alumnosInscriptosMateria
        if(verificarNombreCarrera(carreraRepositorio, nombreCarrera)){
            // seguir
        }
        return null;
    }
    // todo:  solo servicio de materia

    private boolean verificarNombreCarrera(CarreraRepositorio carreraRepositorio, String nombreCarrera){
        for(Carrera carrera: carreraRepositorio.buscarTodos()){
            if(carrera.getNombre().equals(nombreCarrera)){
                return true;
            }
        }

        return false;
    }
}
