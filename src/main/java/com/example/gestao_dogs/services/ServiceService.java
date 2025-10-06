package com.example.gestao_dogs.services;

import com.example.gestao_dogs.models.Service;

import java.util.Optional;

public interface ServiceService {
    Optional<Service>findByServiceType(String serviceType);
    Optional<Service>findByStatusPayment(String statusPayment);
}
