package com.example.gestao_dogs.mappers;

import com.example.gestao_dogs.dtos.PetsDTO;
import com.example.gestao_dogs.models.Pets;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PetsMapper {
    PetsDTO toDTO(Pets pets);

    Pets toEntity(PetsDTO petsDTO);

    List<PetsDTO> toDTOList(List<PetsDTO> petsDTOList);

    List<Pets> toEntityList(List<Pets> petsList);
}
