package com.pruebanexos.tecnica.mappers;

import com.pruebanexos.tecnica.dto.CargoDto;
import com.pruebanexos.tecnica.dto.UsuarioDto;
import com.pruebanexos.tecnica.entities.UsuarioEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
@Mapper
public interface UsuarioMapper {

    UsuarioMapper INSTANCE = Mappers.getMapper(UsuarioMapper.class);

    UsuarioDto toDto(UsuarioEntity usuarioEntity);
    List<UsuarioDto> toDto(List<UsuarioEntity> usuarioEntities);
    UsuarioEntity toEntity(UsuarioDto usuarioDto);
    List<UsuarioEntity> toEntity(List<UsuarioDto> usuarioDtos);
}

