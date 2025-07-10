package ar.com.backoffice.repositorio;

import ar.com.backoffice.modelo.CicloLectivo;

import java.util.List;

public interface CicloLectivoRepositorio extends CRUDRepositorio<CicloLectivo> {
    List<CicloLectivoRepositorio> buscarUno(String ano);
}
