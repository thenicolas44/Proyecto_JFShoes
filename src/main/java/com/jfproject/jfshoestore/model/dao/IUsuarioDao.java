package com.jfproject.jfshoestore.model.dao;

import org.springframework.data.repository.CrudRepository;
import com.jfproject.jfshoestore.model.Entity.UsuarioEntity;

public interface IUsuarioDao extends CrudRepository<UsuarioEntity,Long>{

    /*@Query(value = "SELECT * FROM USUARIOS WHERE USER_NICKNAME = :nickname", nativeQuery = true)
    UsuarioEntity findbyname(@Param("nickname") String nombre); */

    public UsuarioEntity findByUsername(String username);

}
