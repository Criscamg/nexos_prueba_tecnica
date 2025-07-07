package com.pruebanexos.tecnica.mappers;

import com.pruebanexos.tecnica.dto.MercanciaDto;
import com.pruebanexos.tecnica.entities.MercanciaEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface MercanciaMapper {

    MercanciaMapper INSTANCE = Mappers.getMapper(MercanciaMapper.class);

    MercanciaDto toDto(MercanciaEntity mercanciaEntity);
    List<MercanciaDto> toDto(List<MercanciaEntity> mercanciaEntities);
    MercanciaEntity toEntity(MercanciaDto mercanciaDto);
    List<MercanciaEntity> toEntity(List<MercanciaDto> mercanciaDtos);
}
