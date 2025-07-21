package ar.com.backoffice.repositorio.impl;

import ar.com.backoffice.modelo.Alumno;
import ar.com.backoffice.repositorio.AlumnoRepositorio;

import java.util.ArrayList;
import java.util.List;

public class AlumnoRepositorioImpl implements AlumnoRepositorio {

    List<Alumno> alumnosRepositorio;

    public  AlumnoRepositorioImpl(){

        alumnosRepositorio = new ArrayList<>();
        cargarData();
    }

    private void cargarData(){
        alumnosRepositorio.add(new Alumno("Juan", "Pérez", "12345678", "1123456789", "juan.perez@email.com", "Av. Siempre Viva 123"));
        alumnosRepositorio.add(new Alumno("María", "Gómez", "23456789", "1134567890", "maria.gomez@email.com", "Calle Falsa 456"));
        alumnosRepositorio.add(new Alumno("Carlos", "López", "34567890", "1145678901", "carlos.lopez@email.com", "Av. Libertad 789"));
        alumnosRepositorio.add(new Alumno("Laura", "Martínez", "45678901", "1156789012", "laura.martinez@email.com", "Calle Mitre 101"));
        alumnosRepositorio.add(new Alumno("Diego", "Fernández", "56789012", "1167890123", "diego.fernandez@email.com", "San Martín 202"));
        alumnosRepositorio.add(new Alumno("Ana", "Ruiz", "67890123", "1178901234", "ana.ruiz@email.com", "Rivadavia 303"));
        alumnosRepositorio.add(new Alumno("Jorge", "Díaz", "78901234", "1189012345", "jorge.diaz@email.com", "Av. Belgrano 404"));
        alumnosRepositorio.add(new Alumno("Camila", "Sosa", "89012345", "1190123456", "camila.sosa@email.com", "Calle Lavalle 505"));
        alumnosRepositorio.add(new Alumno("Lucía", "Torres", "90123456", "1101234567", "lucia.torres@email.com", "Av. Corrientes 606"));
        alumnosRepositorio.add(new Alumno("Pedro", "Ramírez", "01234567", "1112345678", "pedro.ramirez@email.com", "Calle Alsina 707"));

    }


    @Override
    public Alumno buscarUno(int indice) {

      return this.alumnosRepositorio.get(indice);
    }

    @Override
    public List<Alumno> buscarTodos() {
      return this.alumnosRepositorio;
    }

    @Override
    public void crear(Alumno alumno) {
        this.alumnosRepositorio.add(alumno);
    }


    @Override
    public void modificar(int indice,Alumno alumno) {
        this.alumnosRepositorio.get(indice).setNombre(alumno.getNombre());
        this.alumnosRepositorio.get(indice).setApellido(alumno.getApellido());
        this.alumnosRepositorio.get(indice).setTelefono(alumno.getTelefono());
        this.alumnosRepositorio.get(indice).setEmail(alumno.getEmail());
        this.alumnosRepositorio.get(indice).setDomicilio(alumno.getDomicilio());
    }

    @Override
    public void eliminar(int indice) {
        this.alumnosRepositorio.remove(indice);
    }
}
