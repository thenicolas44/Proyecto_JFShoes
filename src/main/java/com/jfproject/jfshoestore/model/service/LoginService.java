package com.jfproject.jfshoestore.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.jfproject.jfshoestore.model.Entity.UsuarioEntity;
import com.jfproject.jfshoestore.model.dao.IUsuarioDao;

@Service

public class LoginService implements ILoginService{
    @Autowired
    private IUsuarioDao userDAO;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    public LoginService(IUsuarioDao userDAO, BCryptPasswordEncoder passwordEncoder){
        this.userDAO = userDAO;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UsuarioEntity buscarUser(String nombre) {
        return userDAO.findByUsername(nombre);
    }

    @Override
    public void registrarUser(UsuarioEntity nuevoUser) {
        UsuarioEntity existenciaEntity = userDAO.findByUsername(nuevoUser.getUsername());
        if(existenciaEntity!=null){
            throw new IllegalArgumentException("El nombre de usuario ya está en uso");
        }
        String passwordEncriptada = passwordEncoder.encode(nuevoUser.getContrasenia());

        nuevoUser.setContrasenia(passwordEncriptada);
        userDAO.save(nuevoUser);
    }

    @Override
    public UsuarioEntity buscarId(Long id) {
        return userDAO.findById(id).orElse(null);
    }

}
