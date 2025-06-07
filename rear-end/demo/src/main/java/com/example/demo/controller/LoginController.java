package com.example.demo.controller;

import com.example.demo.Service.UserService;
import com.example.demo.entity.LoginInfo;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    private UserService userService;
    @PostMapping("/login")
    @CrossOrigin
    public LoginInfo login(@RequestBody User user) {
        User user1 = userService.login(user);
        if(user1!=null){
            return new LoginInfo(user1.getId(), user1.getUsername(), user1.getName(), user1.getRole());
        }else{
            return null;
        }
    }
}
