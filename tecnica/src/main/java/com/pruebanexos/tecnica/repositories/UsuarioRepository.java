package com.pruebanexos.tecnica.repositories;

import com.pruebanexos.tecnica.entities.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Integer> {
}
