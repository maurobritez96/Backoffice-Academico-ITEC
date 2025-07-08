package ar.com.backoffice.repositorio.impl;

import ar.com.backoffice.modelo.Profesor;
import ar.com.backoffice.repositorio.ProfesorRepositorio;

import java.util.ArrayList;
import java.util.List;

public class ProfesorRepositorioImpl  implements ProfesorRepositorio {
    List<Profesor> profesoresRepositorio;

    public  ProfesorRepositorioImpl(){
        profesoresRepositorio = new ArrayList<>();
        cargarData();

    }

    private void cargarData(){
        profesoresRepositorio.add(new Profesor("Damian", "Bentancur","99999999","100","3764111111","damina@gmail.com","itambe mini"));
        profesoresRepositorio.add(new Profesor("Laura", "Martínez", "12345678", "101", "3764222222", "laura.martinez@gmail.com", "Posadas"));
        profesoresRepositorio.add(new Profesor("Carlos", "Gómez", "23456789", "102", "3764333333", "carlos.gomez@hotmail.com", "Garupá"));
        profesoresRepositorio.add(new Profesor("María", "Fernández", "34567890", "103", "3764444444", "mariaf@yahoo.com", "Candelaria"));
        profesoresRepositorio.add(new Profesor("José", "López", "45678901", "104", "3764555555", "jlopez@outlook.com", "Santa Ana"));
        profesoresRepositorio.add(new Profesor("Ana", "Pérez", "56789012", "105", "3764666666", "ana.perez@gmail.com", "Oberá"));
        profesoresRepositorio.add(new Profesor("Ricardo", "Sosa", "67890123", "106", "3764777777", "rsosa@correo.com", "Eldorado"));
        profesoresRepositorio.add(new Profesor("Sofía", "Acosta", "78901234", "107", "3764888888", "sofia.acosta@gmail.com", "Apóstoles"));
        profesoresRepositorio.add(new Profesor("Lucía", "Ramírez", "89012345", "108", "3764999999", "lucia.ramirez@gmail.com", "Jardín América"));
        profesoresRepositorio.add(new Profesor("Héctor", "Silva", "90123456", "109", "3764000000", "hector.silva@gmail.com", "San Vicente"));

    }

    @Override
    public List<Profesor> buscarUno(String matricula) {
        return List.of();
    }

    @Override
    public List<Profesor> buscarTodos() {
        return List.of();
    }

    @Override
    public void crear(Profesor profesor) {

    }

    @Override
    public void modificar(Profesor profesor) {

    }

    @Override
    public void eliminar(Profesor profesor) {

    }
}
