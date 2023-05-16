package com.example.dao;

import com.example.model.User;

public interface UserDAO {
    void addUser(User user);
    User getUserById(Long id);
    void updateUser(User user);
    void deleteUser(User user);
}
