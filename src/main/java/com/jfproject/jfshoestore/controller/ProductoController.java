package com.jfproject.jfshoestore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jfproject.jfshoestore.model.Entity.ProductoEntity;
import com.jfproject.jfshoestore.model.service.ICategoriaService;
import com.jfproject.jfshoestore.model.service.IProductoService;

@Controller
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    private IProductoService productoService;
    @Autowired
    private ICategoriaService categoriaService;
    @RequestMapping("/")
    public String producto(Model modelo){
        ProductoEntity producto = new ProductoEntity();
        modelo.addAttribute("producto", producto);
        modelo.addAttribute("listaProducto", productoService.mostrarProducto());
        modelo.addAttribute("listaCategoria", categoriaService.mostrarCategorias());
        return "producto/producto";
    }

    @RequestMapping(value = "/guardar", method = RequestMethod.POST)
    public String guardar(ProductoEntity producto){
        productoService.guardarProducto(producto);
        return "redirect:/producto/";
    }

    @RequestMapping("/eliminar/{id}")
    public String eliminar(
        @PathVariable(value = "id") Long id,
        Model modelo,
        RedirectAttributes flash){
            String rpta = productoService.eliminarProducto(id);
            flash.addFlashAttribute("mensaje",rpta);
            return "redirect:/producto/";
    }
}
