
package com.Clinica.SistemaClinicaBack.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "control_evolucion")
public class EvolucionPaciente {
    
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int idControlEvolucion;
     private Date fecha;
     private String comentarioControl;
     @Column(name = "CURP_fk_control", unique = true)
     private String curp;
    
}
