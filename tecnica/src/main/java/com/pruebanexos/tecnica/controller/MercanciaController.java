package com.pruebanexos.tecnica.controller;

import com.pruebanexos.tecnica.dto.MercanciaDto;
import com.pruebanexos.tecnica.dto.MercanciaRequestDeleteDto;
import com.pruebanexos.tecnica.services.IMercanciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/mercancia")
public class MercanciaController {
    @Autowired
    IMercanciaService mercanciaService;
    @GetMapping("/consultar")
    @ResponseBody
    public ResponseEntity<List<MercanciaDto>> consultarMercancia(){
        List<MercanciaDto> cargos = mercanciaService.consultaMercancia();
        return new ResponseEntity<>(cargos, HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<String> crearMercancia(@RequestBody MercanciaDto mercanciaDto){
        mercanciaService.guardarMercancia(mercanciaDto);
        return new ResponseEntity<>("Se ha Guardado la mercancia con éxito", HttpStatus.OK);
    }
    @PostMapping("/modificar")
    public ResponseEntity<String> modificarMercancia(@RequestBody MercanciaDto mercanciaDto){
        mercanciaService.modificarMercancia(mercanciaDto);
        return new ResponseEntity<>("Se ha modificado la mercancia con éxito", HttpStatus.OK);
    }
    @PostMapping("/eliminar")
    public ResponseEntity<String> eliminarMercancia(@RequestBody MercanciaRequestDeleteDto mercanciaDto) throws IOException {
        mercanciaService.eliminarMercancia(mercanciaDto);
        return new ResponseEntity<>("Se ha Eliminado la mercancia con éxito", HttpStatus.OK);
    }
}
