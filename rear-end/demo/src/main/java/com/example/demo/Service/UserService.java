package com.example.demo.Service;

import com.example.demo.entity.User;

import java.util.List;

public interface UserService {
    public List<User> Select();
    public void add(User user);
    public void delete(User user);
    public void update(User user);
    public  User login(User user);
}
