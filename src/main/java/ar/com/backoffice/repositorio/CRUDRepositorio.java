package ar.com.backoffice.repositorio;

import java.util.List;

public interface CRUDRepositorio <T>{
    List<T> buscarTodos();
    void crear(T t);
    void modificar(int indice,T t);
    void eliminar(int indice);
}
