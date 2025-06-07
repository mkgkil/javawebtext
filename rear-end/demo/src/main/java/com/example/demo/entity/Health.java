package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Health {
    private int userId;
    private int id;
    private String name;
    private int age;
    private String gender;
    private String healthcode;
    private String vaccination;
    private String phone;
}
