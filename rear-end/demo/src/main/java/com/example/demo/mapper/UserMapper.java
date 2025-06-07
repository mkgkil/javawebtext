package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
 @Select("select * from user ")
    List<User> Select();
@Insert("insert into user(name,password,role,username,userphone) values(#{name},#{password},#{role},#{username},#{userphone})")
    void add(User user);
@Delete("delete from user where name=#{name} and password=#{password}")
    void delete(User user);
@Update(" update user set username =#{username} where name=#{name} and password=#{password}")
    void update(User user);
@Select("select * from user where name=#{name} and password=#{password}")
    User login(User user);
}
