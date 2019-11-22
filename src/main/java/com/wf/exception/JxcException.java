package com.wf.exception;

import lombok.Getter;

@Getter
public class JxcException extends RuntimeException{

    private Integer code;

    public JxcException(Integer code,String message ) {
        super(message);
        this.code = code;
    }
}
