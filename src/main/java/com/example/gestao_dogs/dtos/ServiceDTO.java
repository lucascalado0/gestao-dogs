package com.example.gestao_dogs.dtos;

import com.example.gestao_dogs.models.enums.ServiceType;
import com.example.gestao_dogs.models.enums.StatusPayment;

import java.time.LocalDate;
import java.util.List;

public record ServiceDTO(
        Long id,
        String description,
        Double value,
        LocalDate initialDate,
        LocalDate endDate,
        ServiceType serviceType,
        StatusPayment statusPayment,
        List<PetsDTO> petsDTOS) {
}
