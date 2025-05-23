package com.pedrin.projeto.infrastructure.exceptions;

public class BusinessException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    public BusinessException(String message){
        super(message);
    }
    public BusinessException(Throwable cause) {
        super(cause);
    }
    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }
}
