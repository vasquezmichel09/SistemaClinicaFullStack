
package com.Clinica.SistemaClinicaBack.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import java.util.Date;

@Entity
@Table(name =  "antecedentes_no_patologicos")
public class AntecedentesNoPatologicos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int idAntecedentesNoPatologicos;
    @Column(name = "CURP_fk_no_patologicos", unique= true)
    private String curp;
    private String frecuenciaLavadoDientes;
    private int usaAxuliaresHigiene;
    private String tiposAuxiliaresHigiene;
    private String grupoSanguineo;
    private String factorRh;
    private int cartillaVacunacion;
    private int esquemaCompleto;
    private String vacunasFaltantes;
    private int AntecedentesAlergicos;
    private String cualAlergicos;
    private String antibioticos;
    private String analgesicos;
    private String anestesicos;       
    private String alimentos;
    private String otrasAlergias;
    private int tieneAdicciones;
    private String tabaco;
    private String Alcohol;
    private String otrasAdicciones;
    private int haSidoHospitalizado;
    private Date fechaHospitalizacion;
    private String motivoHospitalizacion;
    private String padecimientoActual;
    private int haSidoAnestesiado;
    private int haRecibidoTransfusion;
    private int haRecibidoPerforaciones;
    private int consumeMedicamento;
    private int embarazo;
    private int discapacidad;
    private int tieneIntervenciones;
    private String parteCuerpo;
        
    
    
    
    
    
}
