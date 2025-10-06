package com.example.gestao_dogs.service;

import com.example.gestao_dogs.model.Guardian;

import java.util.Optional;

public interface GuardianService {
    Optional<Guardian>findByName(String name);
    Optional<Guardian>findByCpf(String cpf);
    Guardian save(Guardian guardian);
    Optional<Guardian>updateGuardian(Long id, Guardian guardian);
}
