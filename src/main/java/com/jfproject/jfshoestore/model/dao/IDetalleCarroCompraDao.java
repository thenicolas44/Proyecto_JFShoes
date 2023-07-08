package com.jfproject.jfshoestore.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jfproject.jfshoestore.model.Entity.DetalleCarroCompraEntity;

public interface IDetalleCarroCompraDao extends CrudRepository<DetalleCarroCompraEntity, Long>{
    
    @Query(value = "SELECT detalle_carrito_compra.detail_cart_id, detalle_carrito_compra.detail_cart_cantidad, detalle_carrito_compra.cart_id, detalle_carrito_compra.product_id FROM detalle_carrito_compra JOIN carrito_compra ON detalle_carrito_compra.cart_id = carrito_compra.cart_id JOIN usuarios ON usuarios.user_id = carrito_compra.user_id where user_name= :user", nativeQuery = true)
    public List<DetalleCarroCompraEntity> mostrarDetalleCarroComprasPorUsuario(@Param("user") String nombre);
}
