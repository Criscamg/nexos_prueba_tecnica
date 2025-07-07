package com.pruebanexos.tecnica.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "tb_usuario")
public class UsuarioEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre_usuario")
    private String nombreUsuario;

    @Column(name = "id_cargo")
    private String idCargo;

    @Column(name = "fecha_ingreso")
    private Date fechaIngreso;

}
