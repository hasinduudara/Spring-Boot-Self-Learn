package com.example.demo.controller;

import com.example.demo.dto.UserDTO;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/users")
@CrossOrigin

public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public String getUser() {
        return "Hasindu Udara";
    }

    @PostMapping("/saveUser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO) {
        return userService.saveUser(userDTO);
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
