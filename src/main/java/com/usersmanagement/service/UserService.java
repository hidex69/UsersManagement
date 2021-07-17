package com.usersmanagement.service;

import com.usersmanagement.models.User;

import java.util.List;

public interface UserService {
    public List<User> loadUsers();
    public void saveUser(User user);
    public User getUser(int id);
    public void deleteUser(int id);
}
