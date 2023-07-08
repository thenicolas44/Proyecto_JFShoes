package com.jfproject.jfshoestore.model.service;

import java.util.List;

import com.jfproject.jfshoestore.model.Entity.CarroCompraEntity;

public interface ICarroCompraService {
    public void guardarCarroCompra(CarroCompraEntity carroCompra);
    public List<CarroCompraEntity> mostrarCarroCompras();
    public CarroCompraEntity buscarCarroCompra(Long id);
    public void eliminarCarroCompra(Long id);
}
