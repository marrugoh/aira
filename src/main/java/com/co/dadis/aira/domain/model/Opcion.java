package com.co.dadis.aira.domain.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "opciones_web")
public class Opcion implements Serializable {

  @Id
  @Column(name = "OPWC_ID")
  private String id;
  @Column(name = "OPWC_NOMBRE")
  private String nombre;
  @Column(name = "OPWC_ESTADO")
  private String estado;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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
