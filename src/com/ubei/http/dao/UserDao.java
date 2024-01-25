package com.ubei.http.dao;

import com.ubei.http.entity.User;

import java.util.List;
import java.util.Optional;

public class UserDao implements Dao<Integer, User>{

    private static final UserDao INSTANCE = new UserDao();

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public Optional<User> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public void update(User entity) {

    }

    @Override
    public User save(User entity) {
        return null;
    }

    public static UserDao getInstance() {
        return INSTANCE;
    }
}
