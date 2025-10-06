package com.example.gestao_dogs.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity(name = "Guardian")
@Table(name = "tb_guardian")
public class Guardian {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "guardian_id")
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(name = "last_name", nullable = false, length = 100)
    private String lastName;

    @Column(nullable = false, length = 15, unique = true)
    private String cpf;

    @Column(nullable = false, length = 15, unique = true)
    private String phone;

    @Column(nullable = false, length = 100, unique = true)
    private String email;

    @Embedded
    @Column
    private GuardianAdress address;

    @OneToMany(mappedBy = "guardian", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Pets> pets;

}
