package ar.com.backoffice.repositorio.impl;

import ar.com.backoffice.modelo.CicloLectivo;
import ar.com.backoffice.repositorio.CicloLectivoRepositorio;

import java.util.ArrayList;
import java.util.List;

public class CicloLectivoRepositorioImpl implements CicloLectivoRepositorio {
    List<CicloLectivo> ciclosLectivos;

    public CicloLectivoRepositorioImpl(){
        this.ciclosLectivos = new ArrayList<>();
    }

    @Override
    public List<CicloLectivoRepositorio> buscarUno(String ano) {
        return List.of();
    }

    @Override
    public List<CicloLectivo> buscarTodos() {
        return List.of();
    }

    @Override
    public void crear(CicloLectivo cicloLectivo) {

    }

    @Override
    public void modificar(CicloLectivo cicloLectivo) {

    }

    @Override
    public void eliminar(CicloLectivo cicloLectivo) {

    }
}
