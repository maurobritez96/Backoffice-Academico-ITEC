package ar.com.backoffice.securirty.service;

import ar.com.backoffice.securirty.model.User;

public interface UserService extends CRUDService<User> {
    User findOne(String dni);
}
