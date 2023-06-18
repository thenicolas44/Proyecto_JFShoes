package com.jfproject.jfshoestore.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.jfproject.jfshoestore.model.Entity.ProductoEntity;

public interface IProductDao extends CrudRepository<ProductoEntity,Long>{
    
}
