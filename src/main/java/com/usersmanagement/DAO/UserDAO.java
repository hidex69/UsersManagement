package com.usersmanagement.DAO;

import com.usersmanagement.models.User;

import java.util.List;

public interface UserDAO {
    public List<User> loadUsers();
    public void saveUser(User user);
}
