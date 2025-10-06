package com.example.gestao_dogs.infra;

import com.example.gestao_dogs.exception.guardian_exception.GuardianNotFoundException;
import com.example.gestao_dogs.exception.pets_exception.PetNotFoundException;
import com.example.gestao_dogs.exception.service_exception.ServiceArgumentException;
import com.example.gestao_dogs.exception.service_exception.ServiceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(GuardianNotFoundException.class)
    private ResponseEntity<String> GuardianNotFoundHandler(GuardianNotFoundException exception){
        RestErrorMessage restErrorMessage = new RestErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Guardian not found.");
    };

    @ExceptionHandler(GuardianNotFoundException.class)
    private ResponseEntity<String> GuardianArgumentHandler(GuardianNotFoundException exception){
        RestErrorMessage restErrorMessage = new RestErrorMessage(HttpStatus.BAD_REQUEST, exception.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Guardian argument error.");
    };

    @ExceptionHandler(PetNotFoundException.class)
    private ResponseEntity<String> PetNotFoundHandler(PetNotFoundException exception){
        RestErrorMessage restErrorMessage = new RestErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Pet not found.");
    };

    @ExceptionHandler(ServiceNotFoundException.class)
    private ResponseEntity<String> ServiceNotFoundHandler(ServiceNotFoundException exception){
        RestErrorMessage restErrorMessage = new RestErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Service not found.");
    };

    @ExceptionHandler(ServiceArgumentException.class)
    private ResponseEntity<String> ServiceArgumentHandler(ServiceArgumentException exception){
        RestErrorMessage restErrorMessage = new RestErrorMessage(HttpStatus.BAD_REQUEST, exception.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Service argument error.");
    };
}
