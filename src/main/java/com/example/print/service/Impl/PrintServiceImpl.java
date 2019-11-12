package com.example.print.service.Impl;

import com.example.print.dao.PrintMapper;
import com.example.print.model.Print;
import com.example.print.service.PrintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrintServiceImpl implements PrintService {

    @Autowired
    PrintMapper printMapper;

    @Override
    public Boolean addPrint(Print print) {
        Integer addStatus = printMapper.addPrint(print);
        if (addStatus > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean addNewPrint(Print print) {
        Integer addStatus = printMapper.addNewPrint(print);
        if (addStatus > 0){
            return true;
        }
        else {
            return false;
        }
    }
}
