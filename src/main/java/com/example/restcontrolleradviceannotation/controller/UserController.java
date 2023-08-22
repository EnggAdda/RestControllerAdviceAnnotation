package com.example.restcontrolleradviceannotation.controller;

import com.example.restcontrolleradviceannotation.entity.User;
import com.example.restcontrolleradviceannotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    List<User> getAllUsers(){
      return   userService.getUsers();
    }

    @PostMapping("/insertUser")
    User insertUser(@RequestBody User user){
        return   userService.insertUser(user);
    }
}
