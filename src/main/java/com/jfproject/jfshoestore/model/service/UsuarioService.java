package com.jfproject.jfshoestore.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.jfproject.jfshoestore.model.Entity.UsuarioEntity;
import com.jfproject.jfshoestore.model.dao.IUsuarioDao;

@Service
public class UsuarioService implements IUsuarioService{



    @Autowired
    private IUsuarioDao usuarioDAO;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;


    @Autowired
    public UsuarioService(IUsuarioDao usuarioDAO, BCryptPasswordEncoder passwordEncoder){
        this.usuarioDAO = usuarioDAO;
        this.passwordEncoder = passwordEncoder;
    }


    
    @Override
    public void guardarUsuario(UsuarioEntity usuario) {
        UsuarioEntity existenciaEntity = usuarioDAO.findByUsername(usuario.getUsername());
        if(existenciaEntity!=null){
            throw new IllegalArgumentException("El nombre de usuario ya está en uso");
        }
        String passwordEncriptada = passwordEncoder.encode(usuario.getContrasenia());

        usuario.setContrasenia(passwordEncriptada);
        usuarioDAO.save(usuario);
    }

    @Override
    public List<UsuarioEntity> mostrarUsuarios() {
        return (List<UsuarioEntity>)usuarioDAO.findAll();
    }
        

    @Override
    public UsuarioEntity buscarUsuario(Long id) {
        return usuarioDAO.findById(id).orElse(null);
    }

    @Override
    public String eliminarUsuario(Long id) {
        String rpta = "";
        try{
            usuarioDAO.deleteById(id);
            rpta = "Se eliminó el usuario correctamente";
        }catch(Exception e ){
            rpta = e.getMessage();
        }
        return rpta;
    }
    
}
