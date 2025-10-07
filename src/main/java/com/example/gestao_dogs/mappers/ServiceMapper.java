package com.example.gestao_dogs.mappers;

import com.example.gestao_dogs.dtos.PetsDTO;
import com.example.gestao_dogs.dtos.ServiceDTO;
import com.example.gestao_dogs.models.Service;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ServiceMapper {

    ServiceDTO toDTO(Service service);

    Service toEntity(ServiceDTO serviceDTO);

    List<PetsDTO> toDTOList(List<Service> services);

    List<Service> toEntityList(List<ServiceDTO> serviceDTOs);
}
