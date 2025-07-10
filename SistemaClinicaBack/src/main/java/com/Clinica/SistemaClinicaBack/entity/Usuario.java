package com.Clinica.SistemaClinicaBack.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    private String matricula;
    private String nombreUsuario;
    @Column(unique = true)
    private String usuario;
    private String contrasena;
    private String periodo;
    private String roles;


    public Usuario() {
    }

    public Usuario(String matricula, String nombreUsuario, String usuario, String contrasena, String periodo, String roles) {
        this.matricula = matricula;
        this.nombreUsuario = nombreUsuario;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.periodo = periodo;
        this.roles = roles;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }


}
