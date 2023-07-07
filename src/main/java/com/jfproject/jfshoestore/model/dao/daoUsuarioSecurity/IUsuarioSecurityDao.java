package com.jfproject.jfshoestore.model.dao.daoUsuarioSecurity;

import org.springframework.data.repository.CrudRepository;

import com.jfproject.jfshoestore.model.Entity.UsuarioSecurity.UsuarioSecurityEntity;

public interface IUsuarioSecurityDao extends CrudRepository<UsuarioSecurityEntity, Long>{
    public UsuarioSecurityEntity findByUsername(String username);
}
