package com.pruebanexos.tecnica.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "tb_mercancia")
public class MercanciaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "nombre_mercancia")
    private String nombreMercancia;
    @Column(name = "cantidad")
    private int cantidad;
    @Column(name = "fecha_registro")
    private Date fechaRegistro;
    @Column(name = "usuario_id_registro")
    private int usuarioRegistro;
    @Column(name = "fecha_modificacion")
    private Date fechaModificacion;
    @Column(name = "usuario_id_modificacion")
    private Integer usuarioModificacion;
}
