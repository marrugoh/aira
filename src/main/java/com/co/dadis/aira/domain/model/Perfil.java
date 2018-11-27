package com.co.dadis.aira.domain.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "perfiles")
@IdClass(value = PerfilPk.class)
public class Perfil implements Serializable {

  @Id
  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "PERV_USUARIO",nullable = false)
  private Opcion usuario;
  @Id
  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "PERV_OPCION",nullable = false)
  private Usuario opcion;
  @Id
  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "PERV_ROL",nullable = false)
  private Rol rol;
  @Column(name = "PERV_NOMBRE")
  private String nombre;


  public Opcion getUsuario() {
    return usuario;
  }

  public void setUsuario(Opcion usuario) {
    this.usuario = usuario;
  }

  public Usuario getOpcion() {
    return opcion;
  }

  public void setOpcion(Usuario opcion) {
    this.opcion = opcion;
  }

  public Rol getRol() {
    return rol;
  }

  public void setRol(Rol rol) {
    this.rol = rol;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
}
