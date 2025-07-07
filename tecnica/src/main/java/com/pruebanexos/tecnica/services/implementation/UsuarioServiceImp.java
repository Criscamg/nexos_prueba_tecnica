package com.pruebanexos.tecnica.services.implementation;

import com.pruebanexos.tecnica.dto.CargoDto;
import com.pruebanexos.tecnica.dto.UsuarioDto;
import com.pruebanexos.tecnica.entities.UsuarioEntity;
import com.pruebanexos.tecnica.mappers.UsuarioMapper;
import com.pruebanexos.tecnica.repositories.UsuarioRepository;
import com.pruebanexos.tecnica.services.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImp implements IUsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;
    /**
     * @return
     */
    @Override
    public List<UsuarioDto> consultaUsuarios() {
        List<UsuarioDto> usuarios = UsuarioMapper.INSTANCE.toDto(usuarioRepository.findAll());
        return usuarios;
    }

    /**
     * @param usuario
     */
    @Override
    public void guardarUsuario(UsuarioDto usuario) {
        if(usuario.getFechaIngreso() == null || !usuario.getFechaIngreso().after(new Date())){
            usuario.setFechaIngreso(new Date());
            UsuarioEntity usuarioEntity = UsuarioMapper.INSTANCE.toEntity(usuario);
            usuarioRepository.save(usuarioEntity);
        }

    }
}
