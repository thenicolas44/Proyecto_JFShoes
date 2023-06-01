package com.jfproject.jfshoestore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jfproject.jfshoestore.model.Entity.UsuarioEntity;
import com.jfproject.jfshoestore.model.service.ILoginService;

@Controller
@RequestMapping("/login")

public class LoginController {
    @Autowired ILoginService loginService;

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
    @RequestMapping("/guardar")
    public String guardarRegistro(UsuarioEntity user){
        loginService.registrarUser(user);
        return "redirect:/login/";
    }
}
