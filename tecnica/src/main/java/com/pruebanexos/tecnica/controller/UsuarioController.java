package com.pruebanexos.tecnica.controller;

import com.pruebanexos.tecnica.dto.UsuarioDto;
import com.pruebanexos.tecnica.entities.CargoEntity;
import com.pruebanexos.tecnica.entities.UsuarioEntity;
import com.pruebanexos.tecnica.services.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    IUsuarioService usuarioService;

    @GetMapping("/consultar")
    @ResponseBody
    public ResponseEntity<List<UsuarioDto>> consultaUsuarios(){
        List<UsuarioDto> cargos = usuarioService.consultaUsuarios();
        return new ResponseEntity<>(cargos, HttpStatus.OK);
    }
}
