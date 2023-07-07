package com.jfproject.jfshoestore.model.service;

import java.util.List;

import com.jfproject.jfshoestore.model.Entity.UsuarioEntity;

public interface IUsuarioService {
    public void guardarUsuario(UsuarioEntity usuario);
    public List<UsuarioEntity> mostrarUsuarios();
    public UsuarioEntity buscarUsuario(Long id);
    public String eliminarUsuario(Long id);
}
