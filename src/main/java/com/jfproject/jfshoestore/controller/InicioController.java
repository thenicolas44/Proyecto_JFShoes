package com.jfproject.jfshoestore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jfproject.jfshoestore.model.service.IServicio;

@Controller

public class InicioController {
    @Autowired
    private IServicio miServicio;

    @RequestMapping("/inicio")
    public String principal(){
        return "principal";
    }
    @RequestMapping("/catalogo")
    public String catalogo(){
        return "catalogo";
    }
    @RequestMapping("/detalle/{user}/{password}/{element}")
    public String detalle(
        @PathVariable String user,
        @PathVariable String password,
        @PathVariable int element,
        Model modelo
    ){
        String nombre = miServicio.nanmeProduct(element);
        String descripcion = miServicio.descProduct(element);
        String precio = miServicio.priceProduct(element);
        String enlace = miServicio.srcProduct(element);
        String conecting = (user +"/"+password+"/"+element);


        modelo.addAttribute("nombre", nombre);
        modelo.addAttribute("descripcion", descripcion);
        modelo.addAttribute("precio", precio);
        modelo.addAttribute("enlace", enlace);
        modelo.addAttribute("elemento", conecting);
        return "detalle";
    }
    @RequestMapping("/acerca")
    public String empresa(){
        return "empresa";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    
}
