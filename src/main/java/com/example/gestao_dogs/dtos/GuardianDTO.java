package com.example.gestao_dogs.dtos;

import com.example.gestao_dogs.models.GuardianAdress;
import com.example.gestao_dogs.models.Pets;

import java.util.List;

public record GuardianDTO(
        Long id,
        String name,
        String lastName,
        String email,
        String phone,
        GuardianAdress guardianAdress,
        String cpf,
        List<Pets> pets) {
}
