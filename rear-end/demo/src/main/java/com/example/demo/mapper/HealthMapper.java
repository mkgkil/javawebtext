package com.example.demo.mapper;

import com.example.demo.entity.Health;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface HealthMapper {
    @Update("UPDATE health SET healthcode = #{healthcode}, vaccination = #{vaccintion} WHERE userId = #{userId}")
    void updateHealth(Health health);
    @Insert("insert into health(name,age,gender,healthcode,vaccination,userId) values(#{name},#{age},#{gender},#{healthcode},#{vaccination},#{userId})")
    void insertHealth(Health health);
    @Select("select * from health left join  user on health.userId = user.id")
    List<Health> SelectHealth();
}
