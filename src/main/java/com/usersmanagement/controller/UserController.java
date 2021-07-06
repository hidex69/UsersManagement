package com.usersmanagement.controller;

import com.usersmanagement.DAO.UserDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @Autowired
    private UserDAOImpl studentDAO;

    @GetMapping("/")
    public String showStudents(Model model) {

        model.addAttribute("users", studentDAO.loadUsers());

        return "user-list";
    }
}
