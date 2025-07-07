package com.pruebanexos.tecnica.controller;

import com.pruebanexos.tecnica.dto.CargoDto;
import com.pruebanexos.tecnica.entities.CargoEntity;
import com.pruebanexos.tecnica.services.ICargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;
import java.util.List;

@RestController
@RequestMapping("/mercancia")
public class CargoController {

    @Autowired
    ICargoService cargoService;

    @GetMapping("/cargos")
    @ResponseBody
    public ResponseEntity<List<CargoDto>> consultaCargos(){
        List<CargoDto> cargos = cargoService.consultaCargos();
        return new ResponseEntity<>(cargos,HttpStatus.OK);
    }
}
