package com.pruebanexos.tecnica.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class MercanciaDto {
    private int id;
    private String nombreMercancia;
    private int cantidad;
    private Date fechaRegistro;
    private int usuarioRegistro;
    private Date fechaModificacion;
    private Integer usuarioModificacion;
}
