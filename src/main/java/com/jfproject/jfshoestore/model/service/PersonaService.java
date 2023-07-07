package com.jfproject.jfshoestore.model.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.jfproject.jfshoestore.model.Entity.PersonaEntity;
import com.jfproject.jfshoestore.model.dao.IPersonaDao;

public class PersonaService implements IPersonaService{

    @Autowired
	private IPersonaDao personaDao;

    @Override
    public void guardarPersona(PersonaEntity nuevaPersona) {
        personaDao.save(nuevaPersona);
    }
    
}
