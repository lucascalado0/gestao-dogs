package com.example.gestao_dogs.repository;

import com.example.gestao_dogs.model.Guardian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface GuardianRepository extends JpaRepository<Guardian, Long> {
    Optional<Guardian>findByName(String name);
    Optional<Guardian>findByCpf(String cpf);
}
