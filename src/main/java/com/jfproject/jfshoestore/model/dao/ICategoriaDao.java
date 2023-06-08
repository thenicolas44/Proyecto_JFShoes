package com.jfproject.jfshoestore.model.dao;

import org.springframework.data.repository.CrudRepository;
import com.jfproject.jfshoestore.model.Entity.CategoriaEntity;

public interface ICategoriaDao extends CrudRepository<CategoriaEntity,Long>{
    
}
