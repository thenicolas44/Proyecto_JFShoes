package com.jfproject.jfshoestore.model.service;

import java.util.List;

import com.jfproject.jfshoestore.model.Entity.CategoriaEntity;

public interface ICategoriaService {
    public void guardarCategoria(CategoriaEntity categoria);
    public List<CategoriaEntity> mostrarCategorias();
    public CategoriaEntity buscarCategoria(Long id);
    public void eliminarCategoria(Long id);
}
