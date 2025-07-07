package com.pruebanexos.tecnica.mappers;

import com.pruebanexos.tecnica.dto.CargoDto;
import com.pruebanexos.tecnica.entities.CargoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CargoMapper {

    CargoMapper INSTANCE = Mappers.getMapper(CargoMapper.class);

    CargoDto toDto(CargoEntity cargoEntity);
    List<CargoDto> toDto(List<CargoEntity>cargoEntities);
}
