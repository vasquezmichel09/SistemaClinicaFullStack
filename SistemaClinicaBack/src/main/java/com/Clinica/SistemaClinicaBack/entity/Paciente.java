
package com.Clinica.SistemaClinicaBack.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;


@Entity
@Table(name =  "paciente")
public class Paciente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPaciente;
    private String nombrePaciente;
    @Column( unique= true)
    private String curp;
    private String sexo;
    private String edad;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;
    private String domicilio;
    private String telefonoCasa;
    private String telefonoCelular;
    private String religion;
    private String ocupacion;
    private String escolaridad;
    private String estadoCivil;
    private String derechohabiente;
    private String medicoFamiliar;
    private String numeroMedico;
    private String ultimaConsulta;

    public Paciente() {
    }

    public Paciente(int idPaciente, String nombrePaciente, String CURP, String Sexo, String edad, LocalDate Fecha_nacimiento, String domicilio, String telefono_casa, String telefono_celular, String religion, String ocupacion, String escolaridad, String estadoCivil, String derechohabiente, String medico_familiar, String numero_medico, String ultimaConsulta) {
        this.idPaciente = idPaciente;
        this.nombrePaciente = nombrePaciente;
        this.curp = CURP;
        this.sexo = Sexo;
        this.edad = edad;
        this.fechaNacimiento = Fecha_nacimiento;
        this.domicilio = domicilio;
        this.telefonoCasa = telefono_casa;
        this.telefonoCelular = telefono_celular;
        this.religion = religion;
        this.ocupacion = ocupacion;
        this.escolaridad = escolaridad;
        this.estadoCivil = estadoCivil;
        this.derechohabiente = derechohabiente;
        this.medicoFamiliar = medico_familiar;
        this.numeroMedico = numero_medico;
        this.ultimaConsulta = ultimaConsulta;
    }

    public String getNumero_medico() {
        return numeroMedico;
    }

    public void setNumero_medico(String numero_medico) {
        this.numeroMedico = numero_medico;
    }

    
   

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getCURP() {
        return curp;
    }

    public void setCURP(String CURP) {
        this.curp = CURP;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String Sexo) {
        this.sexo = Sexo;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public LocalDate getfechaNacimiento() {
        return fechaNacimiento;
    }

    public void setfechaNacimiento(LocalDate Fecha_nacimiento) {
        this.fechaNacimiento = Fecha_nacimiento;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefonoCasa() {
        return telefonoCasa;
    }

    public void setTelefonoCasa(String telefono_casa) {
        this.telefonoCasa = telefono_casa;
    }

    public String getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(String telefono_celular) {
        this.telefonoCelular = telefono_celular;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getEscolaridad() {
        return escolaridad;
    }

    public void setEscolaridad(String escolaridad) {
        this.escolaridad = escolaridad;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getDerechohabiente() {
        return derechohabiente;
    }

    public void setDerechohabiente(String derechohabiente) {
        this.derechohabiente = derechohabiente;
    }

    public String getMedicoFamiliar() {
        return medicoFamiliar;
    }

    public void setMedicoFamiliar(String medico_familiar) {
        this.medicoFamiliar = medico_familiar;
    }

    public String getUltimaConsulta() {
        return ultimaConsulta;
    }

    public void setUltimaConsulta(String ultimaConsulta) {
        this.ultimaConsulta = ultimaConsulta;
    }
    
    
    
}
