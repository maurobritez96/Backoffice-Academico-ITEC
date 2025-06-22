package ar.com.backoffice.securirty.service;

import java.util.List;

public interface CRUDService <T>{
    void create(T t);
    List<T> findAll();
    void update(T t);
    void delete(T t);
    //boolean verify(T t); Implementar despues
}
