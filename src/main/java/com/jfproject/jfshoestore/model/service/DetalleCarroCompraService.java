package com.jfproject.jfshoestore.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jfproject.jfshoestore.model.Entity.DetalleCarroCompraEntity;
import com.jfproject.jfshoestore.model.dao.IDetalleCarroCompraDao;

@Service
public class DetalleCarroCompraService implements IDetalleCarroCompraService{

    @Autowired
    private IDetalleCarroCompraDao detalleCarroCompraDao;

    @Override
    public void guardarDetalleCarroCompra(DetalleCarroCompraEntity detalleCarroCompra) {
        detalleCarroCompraDao.save(detalleCarroCompra);
    }

    @Override
    public List<DetalleCarroCompraEntity> mostrarDetalleCarroCompras() {
        return (List<DetalleCarroCompraEntity>)detalleCarroCompraDao.findAll();
    }

    @Override
    public DetalleCarroCompraEntity buscarDetalleCarroCompra(Long id) {
        return detalleCarroCompraDao.findById(id).orElse(null);
    }

    @Override
    public void eliminarDetalleCarroCompra(Long id) {
        detalleCarroCompraDao.deleteById(id);
    }

    @Override
    public List<DetalleCarroCompraEntity> mostrarDetalleCarroComprasUser(String user) {
        return detalleCarroCompraDao.mostrarDetalleCarroComprasPorUsuario(user);
    }

    
}
