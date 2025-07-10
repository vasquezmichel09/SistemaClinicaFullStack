
package com.Clinica.SistemaClinicaBack.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tutor")
public class Tutor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTutor;
    private String nombre;
    private String edad;
    private String domicilio;
    private String telefonoCasa;
    private String celular;
    @Column(name = "CURP_fk_tutor", unique = true)
    private String curp;
    
}
