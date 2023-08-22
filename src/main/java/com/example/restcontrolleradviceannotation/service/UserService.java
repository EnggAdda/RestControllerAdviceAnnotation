package com.example.restcontrolleradviceannotation.service;


import com.example.restcontrolleradviceannotation.entity.User;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private static final List<User> users = new ArrayList<>();

    @PostConstruct
    private void init() {
        User user = new User(1,"Arun" ,"Lucknow");

        this.users.add(user);
    }

    public List<User> getUsers() {
        return this.users;
    }

    public User insertUser(User user) throws NullPointerException {
        if(user.getName()  == null){
            throw new NullPointerException("User  name  cannot be null");
        }
        this.users.add(user);
        return user;
    }
}
