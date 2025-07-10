package com.Clinica.SistemaClinicaBack.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "exploracion_estomatognatico")
public class ExploracionEstomatognatico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEstomatognatico;
    private int ruidos;
    private int lateralidad;
    private int apertura;
    private int chasquidos;
    private int crepitacion;
    private int dificultadAbrirboca;
    private int dolorAberturaLateralidad;
    private int fatigaDolorMuscular;
    private int disminuicionAbertura;
    private int desviacionAberturaCierre;
    @Column(name = "CURP_fk_estomatognatico", unique = true)
    private String curp;
    
    
    
}
