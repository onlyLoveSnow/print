package com.example.print.service;

import com.example.print.model.User;

public interface UserService {

    User login(User user);

    Boolean register(User user);

    Boolean exist(String num);
}
