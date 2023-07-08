package com.jfproject.jfshoestore.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.jfproject.jfshoestore.model.Entity.TipoUsuarioEntity;

public interface ITipoUsuarioDao extends CrudRepository<TipoUsuarioEntity,Long>{
    
}
