package com.example.print.service;

import com.example.print.model.Print;
import org.springframework.stereotype.Service;

public interface PrintService {
    Boolean addPrint(Print print);

    Boolean addNewPrint(Print print);
}
