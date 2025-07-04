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
    public List<Alumno> buscarUno(String dni) {
      List<Alumno>alumnos = new ArrayList<>();
      for(Alumno alumno: this.alumnosRepositorio){
          if(alumno.getDni().equals(dni) ){
              alumnos.add(alumno);
              break;
          }
      }
        return alumnos;
    }

    @Override
    public List<Alumno> buscarTodos() {
      return this.alumnosRepositorio;
    }

    private boolean verificarDni(String dni){
        boolean encontrado = false;
        for(Alumno alumno: this.alumnosRepositorio){
            if (alumno.getDni().equals(dni)){
                encontrado = true;
                break;
            }
        }
        return  encontrado;
    }



    @Override
    public void crear(Alumno alumno) {
        if(!verificarDni(alumno.getDni())){
            alumnosRepositorio.add(alumno);
        }
    }

    private int buscarIndice(Alumno alumno){
        int indice = 0;
        for(Alumno alu: this.alumnosRepositorio  ){
            if(alu.getDni().equals(alumno.getDni())){
                break;

            }
            indice ++;
        }
        return indice;
    }

    @Override
    public void modificar(Alumno alumno) {
        int indice = 0;
        if(verificarDni(alumno.getDni())){
            indice = buscarIndice(alumno);
            this.alumnosRepositorio.get(indice).setNombre(alumno.getNombre());
            this.alumnosRepositorio.get(indice).setApellido(alumno.getApellido());
            this.alumnosRepositorio.get(indice).setTelefono(alumno.getTelefono());
            this.alumnosRepositorio.get(indice).setEmail(alumno.getEmail());
            this.alumnosRepositorio.get(indice).setDomicilio(alumno.getDomicilio());
        }

    }

    @Override
    public void eliminar(Alumno alumno) {
        int indice = 0;
        for(Alumno alu: this.alumnosRepositorio){
            if(alu.getDni().equals(alumno.getDni())){
                indice = buscarIndice(alumno);
                this.alumnosRepositorio.remove(indice);
                break;
            }

        }

    }
}
