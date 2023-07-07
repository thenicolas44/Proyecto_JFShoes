package com.jfproject.jfshoestore.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jfproject.jfshoestore.model.dao.ICategoriaDao;
import com.jfproject.jfshoestore.model.Entity.CategoriaEntity;

@Service
public class CategoriaService implements ICategoriaService{

    @Autowired
    private ICategoriaDao categoriaDAO;

    @Override
    public void guardarCategoria(CategoriaEntity categoria) {
        categoriaDAO.save(categoria);
    }

    @Override
    public List<CategoriaEntity> mostrarCategorias() {
        return (List<CategoriaEntity>)categoriaDAO.findAll();
    }

    @Override
    public CategoriaEntity buscarCategoria(Long id) {
        return categoriaDAO.findById(id).orElse(null);
    }

    @Override
    public String eliminarCategoria(Long id) {
        String rpta = "";
        try{
            categoriaDAO.deleteById(id);
            rpta = "Se eliminó la categoria correctamente";
        }catch(Exception e ){
            rpta = e.getMessage();
        }
        return rpta;
    }
    
}
