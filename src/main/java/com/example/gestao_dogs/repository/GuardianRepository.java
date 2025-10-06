package com.example.gestao_dogs.repository;

import com.example.gestao_dogs.models.Guardian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface GuardianRepository extends JpaRepository<Guardian, Long> {
    List<Guardian> findByNameContainingIgnoreCase(String name);
    Optional<Guardian>findByCpf(String cpf);
    boolean existsByCpf(String cpf);
}
