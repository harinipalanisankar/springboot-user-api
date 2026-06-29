package com.example.demo.service;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import com.example.demo.model.User;

@Service
public class UserService {

    private List<User> list = new ArrayList<>();

    public List<User> getAllUsers() {
        return list;
    }

    public User addUser(User user) {
        list.add(user);
        return user;
    }
}