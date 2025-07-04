package ar.com.backoffice.servicio;

import java.util.List;

public interface CRUDServicio <T>{
    List<T> buscarTodos();
    void crear(T t);
    void modificar(T t);
    void eliminar(T t);
}
