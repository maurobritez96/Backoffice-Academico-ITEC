package ar.com.backoffice.securirty.repository.impl;

import ar.com.backoffice.securirty.model.User;
import ar.com.backoffice.securirty.repository.UserRepository;

import java.util.List;

public class UserRepositoryImpl implements UserRepository {
    @Override
    public List<User> findOne(String dni) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return List.of();
    }

    @Override
    public void save(User user) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(User user) {

    }
}
