package com.pruebanexos.tecnica.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MercanciaRequestDeleteDto {
    private MercanciaDto mercancia;
    private int idUsuario;
}
