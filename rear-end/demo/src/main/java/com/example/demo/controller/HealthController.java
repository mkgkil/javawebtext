package com.example.demo.controller;

import com.example.demo.Service.HealthService;
import com.example.demo.Service.UserService;
import com.example.demo.entity.Health;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class HealthController {
    @Autowired
    private HealthService healthService;
    @GetMapping("/HealthSelect")
    public List<Health> Select(){
        return healthService.SelectHealth();
    }
    @PostMapping("/Healthadd")
    public void add(Health health){
        healthService.insertHealth(health);
    }
    @PutMapping("/Healthupdate")
    public void update(Health health){
        healthService.updateHealth(health);
    }
}

