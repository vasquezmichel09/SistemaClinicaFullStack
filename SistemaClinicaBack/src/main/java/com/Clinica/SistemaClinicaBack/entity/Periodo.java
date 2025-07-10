
package com.Clinica.SistemaClinicaBack.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name =  "periodo")
public class Periodo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int idPeriodo;
    @Column( unique= true)
    private String periodo;

    public Periodo() {
    }

    public Periodo(int idPeriodo, String periodo) {
        this.idPeriodo = idPeriodo;
        this.periodo = periodo;
    }

    public int getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(int idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    
    
    
    
}
