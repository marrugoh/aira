package com.co.dadis.aira.services.internal;

import com.co.dadis.aira.domain.model.Usuario;
import com.co.dadis.aira.infrastructure.jpa.repositories.UserRepository;
import com.co.dadis.aira.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultUserService implements UserService {

  @Autowired
  private UserRepository userRepository;

  @Override
  public boolean logIn(String nombreUsuario, String password) {

    Usuario usuario=userRepository.findByNombreUsuarioAndPassword(nombreUsuario, password);
    if(usuario != null)
      return true;

    return false;
  }
}
