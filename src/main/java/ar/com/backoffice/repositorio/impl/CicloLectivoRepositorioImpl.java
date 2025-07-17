package ar.com.backoffice.repositorio.impl;

import ar.com.backoffice.modelo.CicloLectivo;
import ar.com.backoffice.repositorio.CarreraRepositorio;
import ar.com.backoffice.repositorio.CicloLectivoRepositorio;

import java.util.ArrayList;
import java.util.List;

public class CicloLectivoRepositorioImpl implements CicloLectivoRepositorio {
    List<CicloLectivo> ciclosLectivos;
    CarreraRepositorio carreraRepositorio;

    public CicloLectivoRepositorioImpl(){
        this.ciclosLectivos = new ArrayList<>();
        this.carreraRepositorio = new CarreraRepositorioImpl();
        cargarData();
    }

    private void cargarData(){
        this.ciclosLectivos.add(new CicloLectivo("2019",carreraRepositorio.buscarUno("Analista en sistemas").get(0)));
        this.ciclosLectivos.add(new CicloLectivo("2019",carreraRepositorio.buscarUno("Gastronomia").get(0)));
        this.ciclosLectivos.add(new CicloLectivo("2020",carreraRepositorio.buscarUno("Analista en sistemas").get(0)));
        this.ciclosLectivos.add(new CicloLectivo("2020",carreraRepositorio.buscarUno("Gastronomia").get(0)));
    }

    @Override
    public List<CicloLectivo> buscarUno(String ano) {
        List<CicloLectivo> ciclosLectivosResult = new ArrayList<>();
        for (CicloLectivo cicloLectivo: this.ciclosLectivos){
            if(cicloLectivo.getAno().equals(ano)){
                ciclosLectivosResult.add(cicloLectivo);
            }
        }
        return ciclosLectivosResult;
    }

    @Override
    public List<CicloLectivo> buscarTodos() {
        return this.ciclosLectivos;
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
