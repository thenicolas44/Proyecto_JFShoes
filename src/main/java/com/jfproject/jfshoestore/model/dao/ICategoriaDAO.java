package com.jfproject.jfshoestore.model.dao;

import org.springframework.data.repository.CrudRepository;
import com.jfproject.jfshoestore.model.Entity.CategoriaEntity;

public interface ICategoriaDAO extends CrudRepository<CategoriaEntity,Long>{
    
}
