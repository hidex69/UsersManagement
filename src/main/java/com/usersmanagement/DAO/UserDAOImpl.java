package com.usersmanagement.DAO;

import com.usersmanagement.models.User;
import com.usersmanagement.rowmapper.UserRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<User> loadUsers() {
        String sql = "SELECT * FROM users";

        List<User> users = jdbcTemplate.query(sql, new UserRowMapper());

        return users;
    }

    @Override
    public void saveUser(User user) {
        String sql = "INSERT into users(name, email, phone_number) values(?, ?, ?)";

        Object[] params = {user.getName(), user.getEmail(), user.getPhoneNumber()};

        jdbcTemplate.update(sql, params);
    }


}
