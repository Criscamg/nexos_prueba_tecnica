package com.pruebanexos.tecnica.repositories;

import com.pruebanexos.tecnica.entities.MercanciaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MercanciaRepository extends JpaRepository<MercanciaEntity,Integer> {
}
