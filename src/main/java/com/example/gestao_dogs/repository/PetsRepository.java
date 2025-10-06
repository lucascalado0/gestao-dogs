package com.example.gestao_dogs.repository;

import com.example.gestao_dogs.models.Pets;
import com.example.gestao_dogs.models.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PetsRepository extends JpaRepository<Pets, Long> {
    List<Pets>findByGuardianName(String name);
    List<Pets> findByNameIgnoreCase(String name);
    List<Pets>findByBreedIgnoreCase(String breed);
    List<Pets>findByServicesContaining(Service service);
}
