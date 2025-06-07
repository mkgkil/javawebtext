package com.example.demo.Service;

import com.example.demo.entity.Health;
import com.example.demo.entity.User;

import java.util.List;

public interface HealthService {
    public List<Health> SelectHealth();
    public void insertHealth(Health health);
    public void updateHealth(Health health);
}


