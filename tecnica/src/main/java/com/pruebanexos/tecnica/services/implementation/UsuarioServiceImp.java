package com.pruebanexos.tecnica.services.implementation;

import com.pruebanexos.tecnica.entities.UsuarioEntity;
import com.pruebanexos.tecnica.repositories.UsuarioRepository;
import com.pruebanexos.tecnica.services.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsuarioServiceImp implements IUsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;
    /**
     * @return
     */
    @Override
    public List<UsuarioEntity> consultaUsuarios() {
        return usuarioRepository.findAll();
    }
}
