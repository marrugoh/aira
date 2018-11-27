package com.co.dadis.aira.controllers;

import com.co.dadis.aira.domain.model.Usuario;
import com.co.dadis.aira.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

  @Autowired
  private UserService userService;

  @RequestMapping(value="/index")
  public String index(Model model) {
    Usuario usuario = new Usuario();
    model.addAttribute("usuario", usuario);
    return "index";
  }

  @RequestMapping(value="/index",method=RequestMethod.POST)
  public String guardar(Usuario usuario) {
    boolean valid=userService.logIn(usuario.getNombreUsuario(),usuario.getPassword());
    if(valid)
      return "redirect:listar";
    else
      return "redirect:index";
  }

  @RequestMapping(value="/listar",method=RequestMethod.GET)
  public String listar(Model model) {
    return "listar";
  }

}
