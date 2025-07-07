package com.pruebanexos.tecnica.services;

import com.pruebanexos.tecnica.dto.UsuarioDto;
import com.pruebanexos.tecnica.entities.UsuarioEntity;

import java.util.List;

public interface IUsuarioService {
    public List<UsuarioDto> consultaUsuarios();
    public void guardarUsuario(UsuarioDto usuario);
}
