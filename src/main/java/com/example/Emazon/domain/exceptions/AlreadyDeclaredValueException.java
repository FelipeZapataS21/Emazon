package com.example.Emazon.domain.exceptions;

public class AlreadyDeclaredValueException extends RuntimeException{
    public AlreadyDeclaredValueException(String message){
        super(message);
    }
}
