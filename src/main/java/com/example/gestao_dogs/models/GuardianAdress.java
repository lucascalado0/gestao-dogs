package com.example.gestao_dogs.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

@Data
@Embeddable
public class GuardianAdress {

    @Column(name = "street", nullable = false, length = 150)
    private String street;

    @Column(name = "city", nullable = false, length = 100)
    private String city;

    @Column(name = "state", nullable = false, length = 100)
    private String state;

    @Column(name = "cep", nullable = false, length = 20)
    private String zipCode;

    @Column(name = "number", nullable = false, length = 5)
    private String number;

    @Column(name = "complement", length = 150)
    private String complement;
}
