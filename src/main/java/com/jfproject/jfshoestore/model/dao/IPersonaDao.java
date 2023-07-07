package com.jfproject.jfshoestore.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.jfproject.jfshoestore.model.Entity.PersonaEntity;

public interface IPersonaDao extends CrudRepository<PersonaEntity,Long>{
    
}
