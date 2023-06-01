package com.jfproject.jfshoestore.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jfproject.jfshoestore.model.Entity.UsuarioEntity;
import com.jfproject.jfshoestore.model.dao.IUsuarioDao;

@Service

public class LoginService implements ILoginService{
    @Autowired
    private IUsuarioDao userDAO;

    @Override
    public UsuarioEntity buscarUser(Long id) {
        return userDAO.findById(id).orElse(null);
    }

    @Override
    public void registrarUser(UsuarioEntity nuevoUser) {
        userDAO.save(nuevoUser);
    }

}
