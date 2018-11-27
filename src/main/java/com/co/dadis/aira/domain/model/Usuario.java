package com.co.dadis.aira.domain.model;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {

  @Id
  @Column(name = "USUN_ID")
  private String id;
  @Column(name = "USUN_DOCUMENTO")
  private String documento;
  @Column(name = "USUC_PRIMER_NOMBRE")
  private String primerNombre;
  @Column(name = "USUC_SEGUNDO_NOMBRE")
  private String segundoNombre;
  @Column(name = "USUC_PRIMER_APELLIDO")
  private String primerApellido;
  @Column(name = "USUC_SEGUNDO_APELLIDO")
  private String segundoApellido;
  @Column(name = "USUC_NOMBRE_USUARIO")
  private String nombreUsuario;
  @Column(name = "USUC_PASSWORD")
  private String password;
  @Column(name = "USUC_DIRECCION")
  private String direccion;
  @Column(name = "USUC_TELEFONO")
  private String telefono;
  @Column(name = "USUC_CELULAR")
  private String celular;
  @Column(name = "USUC_EMAIL")
  private String email;
  @Column(name = "USUC_IPS")
  private int ips;
  @Column(name = "USUC_ESTADO")
  private String estado;
  @Column(name = "USUF_FECHA_CREACION")
  private LocalDate fechaCreacion;
  @Column(name = "USUF_FECHA_MODIFICACION")
  private LocalDate fechaModificacion;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getDocumento() {
    return documento;
  }

  public void setDocumento(String documento) {
    this.documento = documento;
  }

  public String getPrimerNombre() {
    return primerNombre;
  }

  public void setPrimerNombre(String primerNombre) {
    this.primerNombre = primerNombre;
  }

  public String getSegundoNombre() {
    return segundoNombre;
  }

  public void setSegundoNombre(String segundoNombre) {
    this.segundoNombre = segundoNombre;
  }

  public String getPrimerApellido() {
    return primerApellido;
  }

  public void setPrimerApellido(String primerApellido) {
    this.primerApellido = primerApellido;
  }

  public String getSegundoApellido() {
    return segundoApellido;
  }

  public void setSegundoApellido(String segundoApellido) {
    this.segundoApellido = segundoApellido;
  }

  public String getNombreUsuario() {
    return nombreUsuario;
  }

  public void setNombreUsuario(String nombreUsuario) {
    this.nombreUsuario = nombreUsuario;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String getCelular() {
    return celular;
  }

  public void setCelular(String celular) {
    this.celular = celular;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getIps() {
    return ips;
  }

  public void setIps(int ips) {
    this.ips = ips;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public LocalDate getFechaCreacion() {
    return fechaCreacion;
  }

  public void setFechaCreacion(LocalDate fechaCreacion) {
    this.fechaCreacion = fechaCreacion;
  }

  public LocalDate getFechaModificacion() {
    return fechaModificacion;
  }

  public void setFechaModificacion(LocalDate fechaModificacion) {
    this.fechaModificacion = fechaModificacion;
  }
}
