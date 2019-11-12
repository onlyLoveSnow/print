package com.example.print.dao;

import com.example.print.model.Print;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

@Repository
public interface PrintMapper {

    Integer addPrint(Print print);

    Integer addNewPrint(Print print);
}
