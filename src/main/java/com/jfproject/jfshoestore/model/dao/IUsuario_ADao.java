package com.jfproject.jfshoestore.model.dao;

import org.springframework.data.repository.CrudRepository;
import com.jfproject.jfshoestore.model.Entity.UsuarioEntity;

public interface IUsuario_ADao extends CrudRepository<UsuarioEntity,Long>{
    
}
