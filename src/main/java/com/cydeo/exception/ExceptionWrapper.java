package com.cydeo.exception;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ExceptionWrapper {

    private LocalDateTime time;
    private Integer status;
    private String message;
    private String path;

    public ExceptionWrapper(Integer code, String message, String path){
        this.status = code;
        this.message = message;
        this.path = path;
        this.time = LocalDateTime.now();
    }

}
