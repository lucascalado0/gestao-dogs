package com.example.gestao_dogs.exception.guardian_exception;

public class GuardianNotFoundException extends RuntimeException {
    public GuardianNotFoundException(String message) {
        super("Guardian Not Found: " + message);
    }
}
