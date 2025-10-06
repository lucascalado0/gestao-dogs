package com.example.gestao_dogs.exception.service_exception;

public class ServiceArgumentException extends RuntimeException {
    public ServiceArgumentException(String message) {
        super("Service not found" + message);
    }
}
