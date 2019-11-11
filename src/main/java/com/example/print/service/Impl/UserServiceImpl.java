package com.example.print.service.Impl;

import com.example.print.dao.LoginAndRegisterMapper;
import com.example.print.model.User;
import com.example.print.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    LoginAndRegisterMapper userMapper;

    @Override
    public User login(User user) {
        User login = userMapper.login(user);
        if (login != null && login.getPassword().equals(user.getPassword())) {
            return login;
        }
        return null;
    }

    @Override
    public Boolean register(User user) {
        Integer insertResult = userMapper.insert(user);

        if (insertResult > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Boolean exist(User user) {
        Integer exist = userMapper.exist(user);
        System.out.println(exist);
        if (exist > 0) {
            return true;
        } else {
            return false;
        }
    }
}
