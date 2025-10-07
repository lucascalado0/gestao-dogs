package com.example.gestao_dogs.dtos;

import java.time.LocalDate;
import java.util.List;

public record PetsDTO(
        Long id,
        String name,
        String breed,
        Integer age,
        GuardianDTO guardian,
        LocalDate birthDate,
        Double weight,
        String observations,
        List<ServiceDTO> serviceDTOS
        ) {

}
