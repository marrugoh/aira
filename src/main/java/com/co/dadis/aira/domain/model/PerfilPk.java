package com.co.dadis.aira.domain.model;

import java.io.Serializable;
import java.util.Objects;

public class PerfilPk implements Serializable {

  private Usuario usuario;
  private Opcion opcion;
  private Rol rol;


  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + Objects.hashCode(this.usuario.getId());
    result = prime * result + Objects.hashCode( this.opcion.getId());
    result = prime * result + Objects.hashCode(this.rol.getId());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    PerfilPk other = (PerfilPk) obj;
    if (!Objects.equals(this.usuario.getId(), other.usuario.getId()))
      return false;
    if (!Objects.equals(this.opcion.getId(),other.opcion.getId()))
      return false;
    if (!Objects.equals(this.rol.getId(),other.rol.getId()))
      return false;
    return true;
  }

}
