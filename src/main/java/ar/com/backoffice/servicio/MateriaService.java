package ar.com.backoffice.servicio;

import ar.com.backoffice.modelo.AlumnoInscriptoCarrera;
import ar.com.backoffice.modelo.Materia;

public interface MateriaService extends CRUDServicio<Materia> {
    // agregar las firmas de buscar materia por nombre, carrea y cicloLectivo
    Materia registrarAlumno(AlumnoInscriptoCarrera alumnoInscriptoCarrera, String nombreCarrera, String ano, String nombreMateria);
}
