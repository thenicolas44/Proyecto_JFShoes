package com.jfproject.jfshoestore.model.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jfproject.jfshoestore.model.Entity.CarroCompraEntity;

public interface ICarroCompraDao extends CrudRepository<CarroCompraEntity,Long>{
    @Query(value = "SELECT CARRITO_COMPRA.cart_id from carrito_compra JOIN usuarios ON carrito_compra.user_id = usuarios.user_id WHERE usuarios.user_name = :username", nativeQuery = true)
    public Long buscarIdCarro(@Param("username")String nombreUsuario);
}
