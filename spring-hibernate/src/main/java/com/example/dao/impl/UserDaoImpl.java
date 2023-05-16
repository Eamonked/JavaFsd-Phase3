package com.example.dao.impl;

import com.example.dao.UserDAO;
import com.example.model.User;

import jakarta.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public void addUser(User user) {
        sessionFactory.getCurrentSession().save(user);
    }

    @Override
    @Transactional
    public User getUserById(Long id) {
        return sessionFactory.getCurrentSession().get(User.class, id);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        sessionFactory.getCurrentSession().update(user);
    }

    @Override
    @Transactional
    public void deleteUser(User user) {
        sessionFactory.getCurrentSession().delete(user);
    }
}
