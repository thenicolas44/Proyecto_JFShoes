package com.jfproject.jfshoestore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jfproject.jfshoestore.model.Entity.UsuarioEntity;
import com.jfproject.jfshoestore.model.service.ILoginService;
import com.jfproject.jfshoestore.model.service.IServicio;

@Controller
@RequestMapping("/jf-store")
public class NavegacionUserController {
    @Autowired ILoginService loginService;
    @Autowired IServicio miServicio;

    @RequestMapping("/{ident}")
    public String principal(
        @PathVariable(value = "ident") Long num,
        Model modelo
    ){
        UsuarioEntity user = new UsuarioEntity();
        user = loginService.buscarId(num);
        modelo.addAttribute("usuario", user);
        return "principal";
    }
    @RequestMapping("/catalogo/{ident}")
    public String catalogo(
        @PathVariable(value = "ident") Long num,
        Model modelo
    ){
        UsuarioEntity user = new UsuarioEntity();
        user = loginService.buscarId(num);
        modelo.addAttribute("usuario", user);
        return "catalogo";
    }
    @RequestMapping("/detalle/{producto}/{ident}")
    public String detalle(
        @PathVariable(value = "producto") int producto,
        @PathVariable(value = "ident") Long num,
        Model modelo
    ){
        UsuarioEntity user = new UsuarioEntity();
        user = loginService.buscarId(num);
        modelo.addAttribute("usuario", user);
        String nombre = miServicio.nanmeProduct(producto);
        String descripción = miServicio.descProduct(producto);
        String precio = miServicio.priceProduct(producto);
        String enlace = miServicio.srcProduct(producto);
        
        modelo.addAttribute("nombre", nombre);
        modelo.addAttribute("descripción", descripción);
        modelo.addAttribute("precio", precio);
        modelo.addAttribute("enlace", enlace);
        return "detalle";
    }

}
