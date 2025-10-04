package com.example.gestao_dogs.repository;

import com.example.gestao_dogs.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Long> {
    List<Service> findByServiceType(String serviceType);
    List<Service>findByStatusPayment(String statusPayment);
    List<Service>findByDateBetween(LocalDate startDate, LocalDate endDate);
}
