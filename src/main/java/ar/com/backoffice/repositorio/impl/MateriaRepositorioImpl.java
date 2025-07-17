package ar.com.backoffice.repositorio.impl;

import ar.com.backoffice.modelo.Materia;
import ar.com.backoffice.modelo.Profesor;
import ar.com.backoffice.repositorio.CicloLectivoRepositorio;
import ar.com.backoffice.repositorio.MateriaRepositorio;
import ar.com.backoffice.repositorio.ProfesorRepositorio;

import java.util.ArrayList;
import java.util.List;

public class MateriaRepositorioImpl implements MateriaRepositorio {
    List<Materia> materiasRepositorio;
    ProfesorRepositorio profesorRepositorio;
    CicloLectivoRepositorio cicloLectivoRepositorio;

    public MateriaRepositorioImpl(){
        this.materiasRepositorio = new ArrayList<>();
        this.profesorRepositorio = new ProfesorRepositorioImpl();
        this.cicloLectivoRepositorio = new CicloLectivoRepositorioImpl();
        cargarData();
    }

    private void cargarData(){
        Materia matematica1 = new Materia("as20mat1", "matematica 1", cicloLectivoRepositorio.buscarUno("2020").get(0));
        matematica1.setProfesor(profesorRepositorio.buscarUno("102").get(0));

        Materia lenguaje2 = new Materia("as20len2", "lenaguaje 2", cicloLectivoRepositorio.buscarUno("2020").get(0));
        lenguaje2.setProfesor(profesorRepositorio.buscarUno("100").get(0));
        Materia lenguaje1 = new Materia("as20len1", "lenaguaje 1", cicloLectivoRepositorio.buscarUno("2020").get(0));
        lenguaje1.setProfesor(profesorRepositorio.buscarUno("100").get(0));
        List<Materia> correlativasLenguaje2 = new ArrayList<>();
        correlativasLenguaje2.add(lenguaje1);
        correlativasLenguaje2.add(matematica1);
        lenguaje2.setCorrelativas(correlativasLenguaje2);


        Materia ingles1 = new Materia("as20ing1", "ingles 1", cicloLectivoRepositorio.buscarUno("2020").get(0));
        ingles1.setProfesor(profesorRepositorio.buscarUno("104").get(0));
        Materia ingles2 = new Materia("as20ing2", "ingles 2", cicloLectivoRepositorio.buscarUno("2020").get(0));
        ingles2.setProfesor(profesorRepositorio.buscarUno("104").get(0));
        List<Materia> correlativasIngles2 = new ArrayList<>();
        correlativasIngles2.add(ingles1);
        ingles2.setCorrelativas(correlativasIngles2);

        materiasRepositorio.add(matematica1);
        materiasRepositorio.add(lenguaje1);
        materiasRepositorio.add(lenguaje2);
        materiasRepositorio.add(ingles1);
        materiasRepositorio.add(ingles2);
    }

    @Override
    public List<Materia> buscarUno(String codigo) {
        List<Materia> materiasResult = new ArrayList<>();
        for(Materia materia : this.materiasRepositorio){
            if(materia.getCodigo().equals(codigo)){
                materiasResult.add(materia);
            }
        }
        return materiasResult;
    }

    @Override
    public List<Materia> buscarTodos() {
        return this.materiasRepositorio;
    }

    @Override
    public void crear(Materia materia) {
        this.materiasRepositorio.add(materia);
    }

    @Override
    public void modificar(Materia materia) {
        int indice = 0;
        if(buscarExistencia(materia)){
            indice = buscarIndice(materia);
            this.materiasRepositorio.get(indice).setNombre(materia.getNombre());
        }
    }

    @Override
    public void eliminar(Materia materia) {

    }

    @Override
    public void agregarProfesor(Materia materia, Profesor profesor){
        int indice = 0;
        if(buscarExistencia(materia)){
            indice = buscarIndice(materia);
            this.materiasRepositorio.get(indice).setProfesor(profesor);
        }
    }

    @Override
    public void agregarCorrelativas(Materia materia, List<Materia> correlativas){
        int indice = 0;
        if(buscarExistencia(materia)){
            indice = buscarIndice(materia);
            this.materiasRepositorio.get(indice).setCorrelativas(correlativas);
        }
    }

    private int buscarIndice(Materia materia){
        int indice = 0;
        for(Materia mat: this.materiasRepositorio){
            if(mat.getCodigo().equals(materia.getCodigo())){
                break;
            }
            indice++;
        }
        return indice;
    }

    private boolean buscarExistencia(Materia materia){
        boolean existe = false;
        for(Materia mat: this.materiasRepositorio){
            if(mat.getCodigo().equals(materia.getCodigo())){
                existe = true;
                break;
            }
        }

        return existe;
    }

}
