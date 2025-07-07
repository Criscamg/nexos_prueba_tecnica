package com.pruebanexos.tecnica.services;

import com.pruebanexos.tecnica.dto.MercanciaDto;
import com.pruebanexos.tecnica.dto.MercanciaRequestDeleteDto;

import java.io.IOException;
import java.util.List;

public interface IMercanciaService {
    public List<MercanciaDto> consultaMercancia();
    public void guardarMercancia(MercanciaDto mercanciaDto);
    public void modificarMercancia(MercanciaDto mercanciaDto);
    public void eliminarMercancia(MercanciaRequestDeleteDto mercanciaRequestDeleteDto) throws IOException;
}
