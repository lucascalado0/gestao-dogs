package com.example.gestao_dogs.mappers;

import com.example.gestao_dogs.dtos.GuardianAddressDTO;
import com.example.gestao_dogs.models.GuardianAdress;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface GuardianAddressMapper {

    GuardianAddressDTO toDTO(GuardianAdress guardianAddress);

    GuardianAdress toEntity(GuardianAddressDTO guardianAddressDTO);

    List<GuardianAddressDTO> toDTOList(List<GuardianAdress> guardianAddresses);

    List<GuardianAdress> toEntityList(List<GuardianAddressDTO> guardianAddressDTOs);
}
