
package com.Clinica.SistemaClinicaBack.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "diagnostico_tratamiento")
public class DiagnosticoTratamiento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDiagnostico;
    private String interpretacionRx;
    private String diagnostico;
    private String resumenTratamiento;
    @Column(name = "CURP_fk_diagnostico", unique = true)
    private String curp;
}
