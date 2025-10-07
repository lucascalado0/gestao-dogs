package com.example.gestao_dogs.infra;

import com.example.gestao_dogs.exception.guardian_exception.GuardianArgumentException;
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
    private ResponseEntity<RestErrorMessage> GuardianNotFoundHandler(GuardianNotFoundException exception){
        RestErrorMessage restErrorMessage = new RestErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(restErrorMessage);
    };

    @ExceptionHandler(GuardianArgumentException.class)
    private ResponseEntity<RestErrorMessage> GuardianArgumentHandler(GuardianNotFoundException exception){
        RestErrorMessage restErrorMessage = new RestErrorMessage(HttpStatus.BAD_REQUEST, exception.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(restErrorMessage);
    };

    @ExceptionHandler(PetNotFoundException.class)
    private ResponseEntity<RestErrorMessage> PetNotFoundHandler(PetNotFoundException exception){
        RestErrorMessage restErrorMessage = new RestErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(restErrorMessage);
    };

    @ExceptionHandler(ServiceNotFoundException.class)
    private ResponseEntity<RestErrorMessage> ServiceNotFoundHandler(ServiceNotFoundException exception){
        RestErrorMessage restErrorMessage = new RestErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(restErrorMessage);
    };

    @ExceptionHandler(ServiceArgumentException.class)
    private ResponseEntity<RestErrorMessage> ServiceArgumentHandler(ServiceArgumentException exception){
        RestErrorMessage restErrorMessage = new RestErrorMessage(HttpStatus.BAD_REQUEST, exception.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(restErrorMessage);
    };
}
