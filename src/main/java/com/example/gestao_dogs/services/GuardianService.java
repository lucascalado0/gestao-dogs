package com.example.gestao_dogs.services;

import com.example.gestao_dogs.models.Guardian;

import java.util.List;
import java.util.Optional;

public interface GuardianService {
    List<Guardian> findByName(String name);
    Optional<Guardian>findByCpf(String cpf);
    Optional<Guardian>updateGuardian(String cpf, Guardian guardian);
}
