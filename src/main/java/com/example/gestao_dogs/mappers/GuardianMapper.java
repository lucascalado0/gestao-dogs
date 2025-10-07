package com.example.gestao_dogs.mappers;

import com.example.gestao_dogs.dtos.GuardianDTO;
import com.example.gestao_dogs.models.Guardian;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface GuardianMapper {
    GuardianDTO toDTO(Guardian guardian);

    Guardian toEntity(GuardianDTO guardianDTO);

    List<GuardianDTO> toDTOList(List<Guardian> guardians);

    List<Guardian> toEntityList(List<GuardianDTO> guardianDTOs);
}
