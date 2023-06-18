package com.jfproject.jfshoestore.model.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jfproject.jfshoestore.model.Entity.ProductoEntity;
import com.jfproject.jfshoestore.model.dao.IProductDao;

@Service
public class ProductoService implements IProductoService{

    @Autowired
    private IProductDao productDao;

    @Override
    public void guardarProducto(ProductoEntity producto) {
        productDao.save(producto);
    }

    @Override
    public ArrayList<ProductoEntity> mostrarProducto() {
        return (ArrayList<ProductoEntity>) productDao.findAll();
    }

    @Override
    public ProductoEntity buscarProducto(Long id) {
        return productDao.findById(id).orElse(null);
    }

    @Override
    public void eliminarProducto(Long id) {
        productDao.deleteById(id);
    }
    
}
