package com.example.gestao_dogs.exception.guardian_exception;

public class GuardianArgumentException extends RuntimeException {
    public GuardianArgumentException(String message) {
        super("Guardian Argument Error: " + message);
    }
}
