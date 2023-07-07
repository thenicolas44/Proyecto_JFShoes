package com.jfproject.jfshoestore.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
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

    //agregando requestParam para almacenar la imagen
    @RequestMapping(value = "/guardar", method = RequestMethod.POST)
    public String guardar(ProductoEntity producto, @RequestParam("file") MultipartFile imagen){

        //validacion para la imagen
        if(!imagen.isEmpty()){

            //Ruta primaria
            Path directorioImagenes = Paths.get("src//main//resources//static//assets//products");
            //Con esto se obtiene l ruta primaria
            String ruta = directorioImagenes.toFile().getAbsolutePath();

            //Aqui se aplica una excepcion en caso no se carga la imagen
            try {
                //Obtiene la representacion de bytes
                byte[] bytesImg = imagen.getBytes();

                //Ruta primaria + nombre de la imagen
                Path rutaCompleta = Paths.get(ruta + "//" + imagen.getOriginalFilename());
                //Escribe la imagen en el directorio
                Files.write(rutaCompleta, bytesImg);

                //finalmente guardar la imagen en el objeto
                producto.setImagen(imagen.getOriginalFilename());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        productoService.guardarProducto(producto);
        return "redirect:/producto/";
    }

    @RequestMapping("/eliminar/{id}")
    public String eliminar(@PathVariable(value = "id") Long id, Model model, RedirectAttributes flash){
        String rpta = productoService.eliminarProducto(id);
        flash.addFlashAttribute("mensaje",rpta);
        return "redirect:/producto/";
    }
}
