package com.jfproject.jfshoestore.model.service;
import java.util.List;

import com.jfproject.jfshoestore.model.Entity.DetalleCarroCompraEntity;

public interface IDetalleCarroCompraService {
    public void guardarDetalleCarroCompra(DetalleCarroCompraEntity detalleCarroCompra);
    public List<DetalleCarroCompraEntity> mostrarDetalleCarroCompras();
    public List<DetalleCarroCompraEntity> mostrarDetalleCarroComprasUser(String user);
    public DetalleCarroCompraEntity buscarDetalleCarroCompra(Long id);
    public void eliminarDetalleCarroCompra(Long id);
}
