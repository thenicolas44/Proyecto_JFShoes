package com.jfproject.jfshoestore.model.service;

import java.util.ArrayList;

import com.jfproject.jfshoestore.model.Entity.ProductoEntity;

public interface IProductoService {
    public void guardarProducto(ProductoEntity producto);
    public ArrayList<ProductoEntity> mostrarProducto();
    public ProductoEntity buscarProducto(Long id);
    public String eliminarProducto(Long id);
}
