package com.example.gestao_dogs.service;

import com.example.gestao_dogs.model.Pets;

import java.util.List;
import java.util.Optional;

public interface PetsService {
    List<Pets> findByName(String name);
    List<Pets> findByBreed(String breed);
    List<Pets> findByGuardianCpf(String cpf);
    List<Pets> findByGuardianName(String name);
    Optional<Pets> findById(Long id);
    Pets save(Pets pet);
    Optional<Pets> updatePet(Long id, Pets pet);
}
