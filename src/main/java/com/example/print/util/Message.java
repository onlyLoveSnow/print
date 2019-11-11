package com.example.print.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message {
    private String status;
    private String msg;
    private Object obj;

    public Message(String status, String msg) {
        this.status = status;
        this.msg = msg;
    }
}
