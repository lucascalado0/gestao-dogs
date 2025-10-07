package com.example.gestao_dogs.exception.service_exception;

public class ServiceNotFoundException extends RuntimeException {
    public ServiceNotFoundException(String message) {
        super(message);
    }

    public ServiceNotFoundException(){
        super("Service not found");
    }
}
