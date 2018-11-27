package com.co.dadis.aira.infrastructure.jpa.repositories;

import com.co.dadis.aira.domain.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Usuario, String> {

  public Usuario findByNombreUsuarioAndPassword(String nombreUsuario, String password);
}
