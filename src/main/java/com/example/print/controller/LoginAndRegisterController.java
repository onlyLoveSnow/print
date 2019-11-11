package com.example.print.controller;

import com.example.print.model.User;
import com.example.print.service.Impl.UserServiceImpl;
import com.example.print.util.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginAndRegisterController {

    @Autowired
    UserServiceImpl userService;

    @RequestMapping("/register")
    @ResponseBody
    public Message register(User user) {
        if (userService.exist(user.getNum())) {
            return new Message("failed", "该学号已注册，请检查学号！");
        } else {
            Boolean register = userService.register(user);
            if (register) {
                return new Message("success", "用户注册成功！");
            } else {
                return new Message("error", "用户注册失败！请重试");
            }
        }
    }

    @RequestMapping("/login")
    @ResponseBody
    public String login(User user) {
        User login = userService.login(user);
        System.out.println(login);
        if (login != null) {
            return "true";
        } else {
            return "false";
        }
    }

}
