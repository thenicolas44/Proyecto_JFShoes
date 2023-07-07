package com.jfproject.jfshoestore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jfproject.jfshoestore.model.Entity.UsuarioEntity;
import com.jfproject.jfshoestore.model.service.IUsuarioService;



@Controller
@RequestMapping("/usuarios")
public class UsuarioController {
    
    @Autowired
    private IUsuarioService usuarioService;

    @RequestMapping("/")
    public String inicio(Model modeL){
        UsuarioEntity usuario = new UsuarioEntity();
        modeL.addAttribute("usuario", usuario);
        modeL.addAttribute("titulo", "Registrar Nuevo Usuario");
        modeL.addAttribute("listaUsuarios", usuarioService.mostrarUsuarios());
        return "usuario/index";
    }

    @RequestMapping("/guardar")
    public String guardar(UsuarioEntity usuario){
        usuarioService.guardarUsuario(usuario);
        return "redirect:/usuarios/";
    }

    @RequestMapping("/mostrarEditar/{id}")
    public String editar(@PathVariable(value="id") Long id, Model modeL) {
        UsuarioEntity usuario = new UsuarioEntity();
        usuario = usuarioService.buscarUsuario(id);
        modeL.addAttribute("usuario", usuario);
        modeL.addAttribute("titulo", "Editar Usuario");
        modeL.addAttribute("listaUsuarios", usuarioService.mostrarUsuarios());
        return "usuario/index";
    }
    
   @RequestMapping("/eliminar/{id}")
    public String eliminar(@PathVariable(value="id") Long id, Model model, RedirectAttributes flash){
        String rpta = usuarioService.eliminarUsuario(id);
        flash.addFlashAttribute("mensaje", rpta );
        return "redirect:/usuarios/";
    }
}
