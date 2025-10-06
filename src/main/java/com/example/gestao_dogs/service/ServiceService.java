package com.example.gestao_dogs.service;

import com.example.gestao_dogs.model.Service;

import java.util.Optional;

public interface ServiceService {
    Optional<Service>findByServiceType(String serviceType);
    Optional<Service>findByStatusPayment(String statusPayment);
}
