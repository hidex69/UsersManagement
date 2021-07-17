package com.usersmanagement.controller;

import com.usersmanagement.DAO.UserDAOImpl;
import com.usersmanagement.models.User;
import com.usersmanagement.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/")
    public String showUsers(Model model) {

        model.addAttribute("users", userService.loadUsers());

        return "user-list";
    }

    @GetMapping("/add")
    public String addUser(Model model) {
        model.addAttribute("user", new User());

        return "user-add";
    }

    @GetMapping("/update")
    public String updateUser(Model model, @RequestParam("id") int id) {

        model.addAttribute("user", userService.getUser(id));

        return "user-add";
    }

    @PostMapping("/save")
    public String saveUser(User user) {
        userService.saveUser(user);

        return "redirect:/";
    }
}
