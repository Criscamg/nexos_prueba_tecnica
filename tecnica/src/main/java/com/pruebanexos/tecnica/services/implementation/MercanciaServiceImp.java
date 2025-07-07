package com.pruebanexos.tecnica.services.implementation;

import com.pruebanexos.tecnica.dto.MercanciaDto;
import com.pruebanexos.tecnica.dto.MercanciaRequestDeleteDto;
import com.pruebanexos.tecnica.entities.MercanciaEntity;
import com.pruebanexos.tecnica.mappers.MercanciaMapper;
import com.pruebanexos.tecnica.repositories.MercanciaRepository;
import com.pruebanexos.tecnica.services.IMercanciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Date;
import java.util.List;

@Service
public class MercanciaServiceImp implements IMercanciaService {
    @Autowired
    MercanciaRepository mercanciaRepository;
    /**
     * @return
     */
    @Override
    public List<MercanciaDto> consultaMercancia() {
        List<MercanciaDto> mercancias = MercanciaMapper.INSTANCE.toDto(mercanciaRepository.findAll());
        return mercancias;
    }

    /**
     * @param mercanciaDto
     */
    @Override
    public void guardarMercancia(MercanciaDto mercanciaDto) {
        if(mercanciaDto.getFechaRegistro() == null || !mercanciaDto.getFechaRegistro().after(new Date())){
            mercanciaDto.setFechaRegistro(new Date());
            MercanciaEntity mercancia = MercanciaMapper.INSTANCE.toEntity(mercanciaDto);
            mercanciaRepository.save(mercancia);
        }
    }

    /**
     * @param mercanciaDto
     */
    @Override
    public void modificarMercancia(MercanciaDto mercanciaDto) {

        if(mercanciaDto.getFechaModificacion() == null ||
                (!mercanciaDto.getFechaModificacion().after(new Date()) &&
                mercanciaDto.getFechaModificacion().after(mercanciaDto.getFechaRegistro()))){
            mercanciaDto.setFechaModificacion(new Date());
            MercanciaEntity mercancia = MercanciaMapper.INSTANCE.toEntity(mercanciaDto);
            mercanciaRepository.save(mercancia);
        }

    }

    /**
     * @param mercanciaRequestDeleteDto
     */
    @Override
    public void eliminarMercancia(MercanciaRequestDeleteDto mercanciaRequestDeleteDto) throws IOException {
        if(mercanciaRequestDeleteDto.getMercancia().getUsuarioRegistro() == mercanciaRequestDeleteDto.getIdUsuario()){
            mercanciaRepository.deleteById(mercanciaRequestDeleteDto.getMercancia().getId());
        }
        else{
            throw new IOException("No se puede Eliminar la mercancia, ya que el usuario que registro, es diferente al que esta intentando eliminar.");
        }

    }
}
