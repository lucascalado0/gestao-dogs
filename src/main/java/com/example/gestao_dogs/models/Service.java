package com.example.gestao_dogs.models;

import com.example.gestao_dogs.models.enums.ServiceType;
import com.example.gestao_dogs.models.enums.StatusPayment;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity(name = "Service")
@Table(name = "tb_services")
public class Service {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "service_id")
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "service_type", nullable = false)
    private ServiceType serviceType;

    @Enumerated(EnumType.STRING)
    @Column(name = "status_payment", nullable = false)
    private StatusPayment statusPayment;

    @Column(name = "initial_date", nullable = false)
    private LocalDate initialDate;

    @Column(name = "end_date", nullable = false)
    private LocalDate endDate;

    @Column(name = "service_value", nullable = false)
    private Double value;

    @ManyToMany
    @JoinTable(name = "tb_service_pets",
            joinColumns = @JoinColumn(name = "service_id"),
            inverseJoinColumns = @JoinColumn(name = "pet_id"))
    private List<Pets> pets;
}
