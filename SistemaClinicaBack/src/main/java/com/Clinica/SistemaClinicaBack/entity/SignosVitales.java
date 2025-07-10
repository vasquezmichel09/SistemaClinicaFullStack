
package com.Clinica.SistemaClinicaBack.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "signos_vitales")
public class SignosVitales {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSignosVitales;
    private String temperatura;
    private String frecuenciaRespiratoria;
    private String tensionArterial;
    private String frecuenciaCardiaca;
    private String peso;
    private String talla;
    @Column(name = "CURP_fk_signos")
    private String curp;

    public SignosVitales() {
    }

    
    public SignosVitales(int idSignosVitales, String temperatura, String frecuenciaRespiratoria, String tensionArterial, String frecuenciaCardiaca, String peso, String talla, String curp) {
        this.idSignosVitales = idSignosVitales;
        this.temperatura = temperatura;
        this.frecuenciaRespiratoria = frecuenciaRespiratoria;
        this.tensionArterial = tensionArterial;
        this.frecuenciaCardiaca = frecuenciaCardiaca;
        this.peso = peso;
        this.talla = talla;
        this.curp = curp;
    }

    public int getIdSignosVitales() {
        return idSignosVitales;
    }

    public void setIdSignosVitales(int idSignosVitales) {
        this.idSignosVitales = idSignosVitales;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    


    public String getFrecuenciaRespiratoria() {
        return frecuenciaRespiratoria;
    }

    public void setFrecuenciaRespiratoria(String frecuenciaRespiratoria) {
        this.frecuenciaRespiratoria = frecuenciaRespiratoria;
    }

    public String getTensionArterial() {
        return tensionArterial;
    }

    public void setTensionArterial(String tensionArterial) {
        this.tensionArterial = tensionArterial;
    }

    public String getFrecuenciaCardiaca() {
        return frecuenciaCardiaca;
    }

    public void setFrecuenciaCardiaca(String frecuenciaCardiaca) {
        this.frecuenciaCardiaca = frecuenciaCardiaca;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }
    
      
    
    
}
