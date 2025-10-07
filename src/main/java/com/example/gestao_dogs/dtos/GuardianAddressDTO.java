package com.example.gestao_dogs.dtos;

public record GuardianAddressDTO(
        String street,
        String number,
        String city,
        String state,
        String zipCode,
        String complement
) {
}
