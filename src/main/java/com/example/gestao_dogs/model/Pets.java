package com.example.gestao_dogs.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity(name = "Pets")
@Table(name = "tb_pets")
public class Pets {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "pet_id")
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, length = 50)
    private String breed;

    @Transient
    private Integer age;

    @Column(nullable = false)
    private Double weight;

    @Column(name = "birth_date", nullable = false)
    private LocalDate birthDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "guardian_id", nullable = false)
    private Guardian guardian;

    @Column(length = 500)
    private String observations;
}
