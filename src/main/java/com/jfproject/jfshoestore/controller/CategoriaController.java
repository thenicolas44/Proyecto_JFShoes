package com.jfproject.jfshoestore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jfproject.jfshoestore.model.Entity.CategoriaEntity;
import com.jfproject.jfshoestore.model.service.ICategoriaService;

@Controller
@RequestMapping("/categoria")
public class CategoriaController {
    @Autowired
    private ICategoriaService categoriaService;

    @RequestMapping("/")
    public String categoria(Model model){
        CategoriaEntity categoria = new CategoriaEntity();
        model.addAttribute("categoria", categoria);
        model.addAttribute("listaCategorias", categoriaService.mostrarCategorias());
        return "categoria/categoria";
    }

    @RequestMapping("/guardar")
    public String guardar(CategoriaEntity categoria){
        categoriaService.guardarCategoria(categoria);
        return "redirect:/categoria/";
    }

    @RequestMapping("/mostrarEditar/{id}")
    public String editar(@PathVariable (value = "id") Long id, Model model){
        CategoriaEntity categoria = new CategoriaEntity();
        categoria = categoriaService.buscarCategoria(id);
        model.addAttribute("categoria", categoria);
        model.addAttribute("listaCategorias", categoriaService.mostrarCategorias());
        return "categoria/categoria";
    }
    

    @RequestMapping("/eliminar/{id}")
    public String eliminar(@PathVariable (value = "id") Long id){
        categoriaService.eliminarCategoria(id);
        return "redirect:/categoria/";
    }
}
