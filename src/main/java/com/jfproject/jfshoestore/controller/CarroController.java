package com.jfproject.jfshoestore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jfproject.jfshoestore.model.service.IDetalleCarroCompraService;
import com.jfproject.jfshoestore.model.service.IProductoService;

@Controller
@RequestMapping("/jf-store")
public class CarroController {
    
    @Autowired
    private IDetalleCarroCompraService detalleCarroCompraService;

    @Autowired
    private IProductoService productoService;

    @RequestMapping("/carrito/")
    public String carrito(Model model){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();

        model.addAttribute("listaDetalles", detalleCarroCompraService.mostrarDetalleCarroComprasUser(username));
        model.addAttribute("listaProductosDetalle", productoService.mostrarProductosporDetalle(username));
        return "carrito";
    }

}
