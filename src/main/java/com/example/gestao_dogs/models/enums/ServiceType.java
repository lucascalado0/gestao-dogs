package com.example.gestao_dogs.models.enums;

import lombok.Getter;

@Getter
public enum ServiceType {
    DOG_WALK("Passeio"),
    PET_SITTING("Visita e cuidado em domicílio"),
    HOSTING("Hospedagem");

    private final String description;

    ServiceType(String description) {
        this.description = description;
    }
}
