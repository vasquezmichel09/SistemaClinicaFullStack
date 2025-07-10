package com.Clinica.SistemaClinicaBack.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tejidos_blandos")
public class TejidosBlandos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTejidosBlandos;
    private String ganglios;
    private String glandulasSalivales;
    private String labioExterno;
    private String bordeBermellon;
    private String labioInterno;
    private String comisuras;
    private String cariilos;
    private String fondoDeSaco;
    private String frenillos;
    private String lenguaTercioMedio;
    private String paladarDuro;
    private String paladarBlando;
    private String istmoBucofaringe;
    private String lenguaDorso;
    private String lenguaBordes;
    private String lenguaVentral;
    private String pisoBoca;
    private String dientes;
    private String muscosaAveolar;
    private String encia;
    @Column(name = "CURP_fk_tejidos", unique = true)
    private String curp;
}
