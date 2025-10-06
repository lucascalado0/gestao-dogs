package com.example.gestao_dogs.services.impl;

import com.example.gestao_dogs.exception.guardian_exception.GuardianArgumentException;
import com.example.gestao_dogs.exception.guardian_exception.GuardianNotFoundException;
import com.example.gestao_dogs.models.Guardian;
import com.example.gestao_dogs.repository.GuardianRepository;
import com.example.gestao_dogs.services.GuardianService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GuardianServiceImpl implements GuardianService{

    private final GuardianRepository guardianRepository;

    private GuardianServiceImpl(GuardianRepository guardianRepository) {
        this.guardianRepository = guardianRepository;
    }


    public Guardian saveNewGuardian(Guardian guardian) {
        if (guardianRepository.existsByCpf(guardian.getCpf())){
            throw new GuardianArgumentException("Guardian with CPF " + guardian.getCpf() + "already exists");
        }

        return guardianRepository.save(guardian);
    }


    @Override
    public List<Guardian> findByName(String name) {
        return guardianRepository.findByNameContainingIgnoreCase(name);
    }

    @Override
    public Optional<Guardian> findByCpf(String cpf) {
        if (!guardianRepository.existsByCpf(cpf)){
            throw new GuardianNotFoundException("Guardian with CPF " + cpf + " not found");
        }

        return guardianRepository.findByCpf(cpf);
    }

    @Override
    public Optional<Guardian> updateGuardian(String cpf, Guardian guardian) {
        if (!guardianRepository.existsByCpf(cpf)){
            throw new GuardianNotFoundException("Guardian with CPF " + cpf + " not found");
        }

        return guardianRepository.findByCpf(cpf)
                .map(existingGuardian -> {
                    existingGuardian.setPhone(guardian.getPhone());
                    existingGuardian.setAddress(guardian.getAddress());
                    existingGuardian.setEmail(guardian.getEmail());
                    existingGuardian.setPhone(guardian.getPhone());
                    return guardianRepository.save(existingGuardian);
                });
    }
}
