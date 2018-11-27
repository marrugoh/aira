package com.co.dadis.aira.domain.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Rol implements Serializable {

  @Id
  @Column(name = "ROLC_ID")
  private String id;
  @Column(name = "ROLN_CODIGO")
  private int codigo;
  @Column(name = "ROLC_NOMBRE")
  private String nombre;
  @Column(name = "ROLC_ESTADO")
  private String estado;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }
}
