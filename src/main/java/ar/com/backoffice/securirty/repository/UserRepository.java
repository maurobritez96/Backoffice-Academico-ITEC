package ar.com.backoffice.securirty.repository;

import ar.com.backoffice.securirty.model.User;

import java.util.List;

public interface UserRepository extends CRUDRepository<User> {
    List<User> findOne(String dni);
}
