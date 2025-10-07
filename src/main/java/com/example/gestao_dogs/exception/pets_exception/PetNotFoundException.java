package com.example.gestao_dogs.exception.pets_exception;

public class PetNotFoundException extends RuntimeException {
    public PetNotFoundException(String message) {
        super(message);
    }

    public PetNotFoundException(){
        super("Pet not found");
    }
}
