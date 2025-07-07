package com.pruebanexos.tecnica.services.implementation;

import com.pruebanexos.tecnica.entities.CargoEntity;
import com.pruebanexos.tecnica.repositories.CargoRepository;
import com.pruebanexos.tecnica.services.ICargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CargoServiceImp implements ICargoService {
    @Autowired
    CargoRepository cargoRepository;


    /**
     * @return
     */
    @Override
    public List<CargoEntity> consultaCargos() {
        List<CargoEntity> cargos = cargoRepository.findAll();
        return cargos;
    }
}
