package com.pruebanexos.tecnica.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CargoDto {
    private int id;
    private String nombreCargo;
}
