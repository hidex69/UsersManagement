package com.usersmanagement.controller;

import com.usersmanagement.DAO.UserDAOImpl;
import com.usersmanagement.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private UserDAOImpl userDAO;

    @GetMapping("/")
    public String showUsers(Model model) {

        model.addAttribute("users", userDAO.loadUsers());

        return "user-list";
    }

    @GetMapping("/add")
    public String addUser(Model model) {
        model.addAttribute("user", new User());

        return "user-add";
    }

    @PostMapping("/save")
    public String saveUser(User user) {
        userDAO.saveUser(user);

        return "redirect:/";
    }
}
