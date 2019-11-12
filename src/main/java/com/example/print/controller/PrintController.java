package com.example.print.controller;

import com.example.print.dao.PrintMapper;
import com.example.print.model.Print;
import com.example.print.service.Impl.PrintServiceImpl;
import com.example.print.util.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PrintController {

    @Autowired
    PrintServiceImpl printService;

    @RequestMapping("/addPrint")
    @ResponseBody
    public Message test(Print print) {
        print.setGetCreate(System.currentTimeMillis());
        print.setNumber("20170217077");
        Boolean addStatus = printService.addNewPrint(print);
        System.out.println(print);
        if (addStatus) {
            return new Message("success", "预约成功");
        }else {
            return new Message("failed", "预约失败");
        }

    }

}
