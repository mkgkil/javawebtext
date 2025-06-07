package com.example.demo.controller;

import com.example.demo.Service.UserService;
import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController
{
    @Autowired
    private UserService userService;
    @GetMapping("/UserSelect")
    public List<User> Select(){
        return userService.Select();
    }
    @PostMapping("/Useradd")
    public void add(@RequestBody User user){
        System.out.println("user:"+user);
        userService.add(user);
    }
    @DeleteMapping("/Userdelete")
    public void delete(@RequestBody User user){
        System.out.println("user:"+user);
        userService.delete(user);
    }
    @PutMapping("/Userupdate")
    public void update(@RequestBody User user){
        userService.update(user);
    }
}
