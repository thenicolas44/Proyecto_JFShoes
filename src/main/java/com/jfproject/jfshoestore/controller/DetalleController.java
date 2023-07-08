package com.jfproject.jfshoestore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jfproject.jfshoestore.model.Entity.CarroCompraEntity;
import com.jfproject.jfshoestore.model.Entity.DetalleCarroCompraEntity;
import com.jfproject.jfshoestore.model.Entity.ProductoEntity;
import com.jfproject.jfshoestore.model.dao.ICarroCompraDao;
import com.jfproject.jfshoestore.model.dao.IDetalleCarroCompraDao;
import com.jfproject.jfshoestore.model.service.ICarroCompraService;
import com.jfproject.jfshoestore.model.service.IDetalleCarroCompraService;
import com.jfproject.jfshoestore.model.service.IProductoService;

@Controller
@RequestMapping("/detalle")
public class DetalleController {
    
    @Autowired
    private IProductoService productoService;
    @Autowired
    private IDetalleCarroCompraService detalleCarroCompraService;
    @Autowired
    private ICarroCompraDao carroCompraDao;
    @Autowired
    private ICarroCompraService carroCompraService;

    @RequestMapping("/{producto}/")
    public String principal(
        @PathVariable(value = "producto") Long producto,
        Model modelo
    ){

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        CarroCompraEntity carroencontrado = carroCompraService.buscarCarroCompra(carroCompraDao.buscarIdCarro(username));
        modelo.addAttribute("idCarrito", carroencontrado);
        ProductoEntity product = new ProductoEntity();
        product = productoService.buscarProducto(producto);
        if(product == null){
            product = new ProductoEntity();
            product.setNombre_producto("producto no encontrado");
            product.setPrecio(0);
            product.setDescripcion("Sin descripcion");
            product.setColor("--");
            product.setTalla(0);
            product.setImagen("...");   
        }
        DetalleCarroCompraEntity detalleCarroCompraEntity = new DetalleCarroCompraEntity();
        modelo.addAttribute("detalle", detalleCarroCompraEntity);
        modelo.addAttribute("producto", product);
        modelo.addAttribute("idCarrito", carroencontrado);
        return "detalle";
    }

    @RequestMapping("/guardar")
    public String guardarDetalle(DetalleCarroCompraEntity detalle, Model modelo){
        CarroCompraEntity carrito = detalle.getCarrito();
        carrito = carroCompraDao.findById(carrito.getId()).orElse(null);
        detalle.setCarrito(carrito);
        detalleCarroCompraService.guardarDetalleCarroCompra(detalle);
        return "redirect:/jf-store/carrito/";
    }
}
