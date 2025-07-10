
package com.Clinica.SistemaClinicaBack.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "exploracion_cabezacuello")
public class CabezaCuello {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idExploracionCabezacuello;
    private int exostosis;
    private int endotosis;      
    private int dolicocefaico;
    private int mesocefalico;
    private int branquicefalico;       
    private int asimetriaTransversal;       
    private int asimetriaLongitudinal;       
    private int perfilConcavo;       
    private int perfilConvexo;       
    private int perfilRecto;
    private int pielNormal;
    private int pielPalida;       
    private int pielCianotica;       
    private int pielEnrojecida;      
    private int musculosHipotonicos;
    private int musculosHipertonicos;      
    private int musculosEspasticos;        
    private int cadenaGanglionar;
    @Column(unique = true, name = "CURP_fk_exploracion")
    private String curp;
            
            
}
