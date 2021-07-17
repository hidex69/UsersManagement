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

        jdbcTemplate.update(sql, user.getName(), user.getEmail(), user.getPhoneNumber());
    }

    @Override
    public User getUser(int id) {

        String sql = "SELECT * FROM users where id = ?";

        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new UserRowMapper());

    }

    @Override
    public void updateUser(User user) {
        String sql = "UPDATE users SET name = ?, email = ?, phone_number = ? WHERE id = ?";

        jdbcTemplate.update(sql, user.getName(), user.getEmail(), user.getPhoneNumber(), user.getId());
    }
}
