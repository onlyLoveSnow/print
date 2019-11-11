package com.example.print.dao;

import com.example.print.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginAndRegisterMapper {
    User login(User user);

    @Insert("insert into user values(#{num}, #{name}, #{phone}, #{password})")
    Integer insert(User user);

    @Insert("select count(*) from user where num = #{num}")
    Integer exist(User user);
}
