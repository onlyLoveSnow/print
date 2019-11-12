package com.example.print.model;

import lombok.Data;

@Data
public class Print {
    private String printId;
    private String size;
    /**
     * 单双面打印
     */
    private String printStyle;
    /**
     * 黑白彩色打印
     */
    private String printColor;
    private String notes;
    private Long getCreate;
    private Long getModify;
    private String number;
}
