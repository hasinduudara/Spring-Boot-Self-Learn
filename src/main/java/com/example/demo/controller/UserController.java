package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/users")
@CrossOrigin

public class UserController {

    @GetMapping("/getUser")
    public String getUser() {
        return "Hasindu Udara";
    }

    @PostMapping("/saveUser")
    public String saveUser() {
        return "User saved successfully";
    }

    @PutMapping("/updateUser")
    public String updateUser() {
        return "User updated successfully";
    }

    @DeleteMapping("/deleteUser")
    public String deleteUser() {
        return "User deleted successfully";
    }
}
