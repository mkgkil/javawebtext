package com.example.demo.Service.Impl;

import com.example.demo.Service.UserService;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceimpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> Select() {
        return userMapper.Select();
    }

    @Override
    public void add(User user) {
        userMapper.add(user);
    }

    @Override
    public void delete(User user) {
        userMapper.delete(user);
    }
    @Override
    public void update(User user) {
        userMapper.update(user);
    }
    @Override
    public User login(User user){
        return userMapper.login(user);
    }
}

