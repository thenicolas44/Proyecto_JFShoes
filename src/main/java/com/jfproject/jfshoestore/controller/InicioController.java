package com.jfproject.jfshoestore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jfproject.jfshoestore.model.Entity.ProductoEntity;
import com.jfproject.jfshoestore.model.Entity.UsuarioEntity;
import com.jfproject.jfshoestore.model.service.IProductoService;

@Controller
@RequestMapping("/jf-store")
public class InicioController {
    

    @Autowired
    private IProductoService productoService;

    @RequestMapping("/")
    public String principal(Model modelo){
        UsuarioEntity user = new UsuarioEntity();
        modelo.addAttribute("usuario", user);
        return "principal";
    }
    @RequestMapping("/catalogo/")
    public String catalogo(Model modelo){
        UsuarioEntity user = new UsuarioEntity();
        
        modelo.addAttribute("usuario", user);
        modelo.addAttribute("listaproducto", productoService.mostrarProducto());
        return "catalogo";
    }

    

    
/* 
    @RequestMapping("/detalle/{user}/{password}/{element}")
    public String detalle(
        @PathVariable String user,
        @PathVariable String password,
        @PathVariable int element,
        Model modelo
    ){
        String nombre = miServicio.nanmeProduct(element);
        String descripción = miServicio.descProduct(element);
        String precio = miServicio.priceProduct(element);
        String enlace = miServicio.srcProduct(element);
        String connecting = (user +"/"+password+"/"+element);


        modelo.addAttribute("nombre", nombre);
        modelo.addAttribute("descripción", descripción);
        modelo.addAttribute("precio", precio);
        modelo.addAttribute("enlace", enlace);
        modelo.addAttribute("elemento", connecting);
        return "detalle";
    }
*/

    @RequestMapping("/acerca/")
    public String empresa(){
        return "empresa";
    }

    @RequestMapping("/login")
    public String login(){
        return "redirect:/login/";
    }

    @RequestMapping("/politicas/")
    public String privacidad(){
        return "pol_privacidad";
    }
}
