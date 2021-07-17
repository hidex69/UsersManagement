package com.usersmanagement.service;

import com.usersmanagement.DAO.UserDAOImpl;
import com.usersmanagement.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAOImpl userDAO;

    @Override
    public List<User> loadUsers() {
        return userDAO.loadUsers();
    }

    @Override
    public void saveUser(User user) {
        if (user.getId() == 0) {
            userDAO.saveUser(user);
        } else {
            userDAO.updateUser(user);
        }

    }

    @Override
    public User getUser(int id) {
        return userDAO.getUser(id);
    }

    @Override
    public void deleteUser(int id) {
        userDAO.deleteUser(id);
    }
}
