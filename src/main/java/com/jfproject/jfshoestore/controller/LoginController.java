package com.jfproject.jfshoestore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jfproject.jfshoestore.model.Entity.PersonaEntity;
import com.jfproject.jfshoestore.model.Entity.TipoUsuarioEntity;
import com.jfproject.jfshoestore.model.Entity.UsuarioEntity;
import com.jfproject.jfshoestore.model.dao.IPersonaDao;
import com.jfproject.jfshoestore.model.dao.ITipoUsuarioDao;
import com.jfproject.jfshoestore.model.service.ILoginService;
import com.jfproject.jfshoestore.model.service.IPersonaService;

@Controller
@RequestMapping("/login")

public class LoginController {
    @Autowired ILoginService loginService;
    @Autowired IPersonaDao personaDao;
    @Autowired ITipoUsuarioDao tipoUsuarioDao;

    @RequestMapping("/")
    public String inicio(){
        return "login/LoginInicio";
    }
    @RequestMapping("/registrar")
    public String registro(Model modelo){
        UsuarioEntity usuario = new UsuarioEntity();
        modelo.addAttribute("usuario", usuario);
        return "login/LoginRegistro";
    }
    @RequestMapping("/jf-registro")
    public String registroAdmin(Model modelo){
        UsuarioEntity usuario = new UsuarioEntity();
        modelo.addAttribute("usuario", usuario);
        return "login/LoginManager";
    }
    @RequestMapping("/guardar")
    public String guardarRegistro(UsuarioEntity user){
        PersonaEntity personaEntity = user.getPersonas();
        personaEntity = personaDao.save(personaEntity);
        TipoUsuarioEntity tipoUsuarioEntity= user.getTipo_usuarios();
        tipoUsuarioEntity = tipoUsuarioDao.findById(tipoUsuarioEntity.getId()).orElse(null);
        user.setTipo_usuarios(tipoUsuarioEntity);
        user.setPersonas(personaEntity);
        loginService.registrarUser(user);
        return "redirect:/login/";
    }
    
}
