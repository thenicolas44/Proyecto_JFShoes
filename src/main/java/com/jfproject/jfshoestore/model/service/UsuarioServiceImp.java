package com.jfproject.jfshoestore.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jfproject.jfshoestore.model.Entity.UsuarioEntity;
import com.jfproject.jfshoestore.model.dao.IUsuarioDao;

@Service
public class UsuarioServiceImp implements IUsuarioService{

    @Autowired
    private IUsuarioDao usuarioDAO;

    @Override
    public void guardarUsuario(UsuarioEntity usuario) {
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
    public void eliminarUsuario(Long id) {
        usuarioDAO.deleteById(id);
    }
    
}
