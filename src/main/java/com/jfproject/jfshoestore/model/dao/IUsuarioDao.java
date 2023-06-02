package com.jfproject.jfshoestore.model.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jfproject.jfshoestore.model.Entity.UsuarioEntity;

public interface IUsuarioDao extends CrudRepository<UsuarioEntity,Long>{
    @Query(value = "SELECT * FROM USUARIO WHERE USER_NICKNAME = :nickname", nativeQuery = true)
    UsuarioEntity findbyname(@Param("nickname") String nombre);

}
