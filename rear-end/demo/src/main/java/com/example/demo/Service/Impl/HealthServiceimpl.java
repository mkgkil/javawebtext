package com.example.demo.Service.Impl;

import com.example.demo.Service.HealthService;
import com.example.demo.entity.Health;
import com.example.demo.entity.User;
import com.example.demo.mapper.HealthMapper;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HealthServiceimpl implements HealthService {
    @Autowired
    private HealthMapper healthMapper;

   @Override
    public List<Health> SelectHealth() {
        return healthMapper.SelectHealth();
    }

    @Override
    public void insertHealth(Health health)  {
        healthMapper.insertHealth(health);
    }
    @Override
    public void updateHealth(Health health) {
        healthMapper.updateHealth(health);
    }
}

