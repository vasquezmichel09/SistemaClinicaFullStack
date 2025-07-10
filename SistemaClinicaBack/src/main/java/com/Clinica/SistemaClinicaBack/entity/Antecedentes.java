
package com.Clinica.SistemaClinicaBack.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "antecedentes")
public class Antecedentes {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAntecedentes;
    private String descripcionAntecedentes;
    private String tipoAntecedentes;
    private String respuesta;
    private String detalle;
    @Column(name = "CURP_fk_antecedentes")
    private String curp;

    public Antecedentes() {
    }

    public Antecedentes(int idAntecedentes, String descripcionAntecedentes, String tipoAntecedentes, String respuesta, String descripcion, String curp) {
        this.idAntecedentes = idAntecedentes;
        this.descripcionAntecedentes = descripcionAntecedentes;
        this.tipoAntecedentes = tipoAntecedentes;
        this.respuesta = respuesta;
        this.detalle = descripcion;
        this.curp = curp;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }




    public int getIdAntecedentes() {
        return idAntecedentes;
    }

    public void setIdAntecedentes(int idAntecedentes) {
        this.idAntecedentes = idAntecedentes;
    }

    public String getDescripcionAntecedentes() {
        return descripcionAntecedentes;
    }

    public void setDescripcionAntecedentes(String descripcionAntecedentes) {
        this.descripcionAntecedentes = descripcionAntecedentes;
    }

    public String getTipoAntecedentes() {
        return tipoAntecedentes;
    }

    public void setTipoAntecedentes(String tipoAntecedentes) {
        this.tipoAntecedentes = tipoAntecedentes;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }
    
    
    
    
   
}
