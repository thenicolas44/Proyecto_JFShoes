package com.jfproject.jfshoestore.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jfproject.jfshoestore.model.Entity.CarroCompraEntity;
import com.jfproject.jfshoestore.model.dao.ICarroCompraDao;

@Service
public class CarroCompraService implements ICarroCompraService{

    @Autowired
    private ICarroCompraDao carroCompraDao;


    @Override
    public void guardarCarroCompra(CarroCompraEntity carroCompra) {
        carroCompraDao.save(carroCompra);
    }

    @Override
    public List<CarroCompraEntity> mostrarCarroCompras() {
        return (List<CarroCompraEntity>)carroCompraDao.findAll();
    }

    @Override
    public CarroCompraEntity buscarCarroCompra(Long id) {
        return carroCompraDao.findById(id).orElse(null);
    }

    @Override
    public void eliminarCarroCompra(Long id) {
        carroCompraDao.deleteById(id);
    }
    
}
