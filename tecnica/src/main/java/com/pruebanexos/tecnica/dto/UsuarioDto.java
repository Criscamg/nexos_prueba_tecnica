package com.pruebanexos.tecnica.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class UsuarioDto {
    private int id;
    private String nombreUsuario;
    private String idCargo;
    private Date fechaIngreso;
}
