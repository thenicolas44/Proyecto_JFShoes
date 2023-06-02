package com.jfproject.jfshoestore.model.service;

import com.jfproject.jfshoestore.model.Entity.UsuarioEntity;

public interface ILoginService {
    public UsuarioEntity buscarUser(String nombre);
    public void registrarUser(UsuarioEntity nuevoUser);
}
