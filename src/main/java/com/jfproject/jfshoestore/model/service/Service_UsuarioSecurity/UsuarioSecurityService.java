package com.jfproject.jfshoestore.model.service.Service_UsuarioSecurity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jfproject.jfshoestore.model.Entity.UsuarioSecurity.TipoUsuarioEntity;
import com.jfproject.jfshoestore.model.Entity.UsuarioSecurity.UsuarioSecurityEntity;
import com.jfproject.jfshoestore.model.dao.daoUsuarioSecurity.IUsuarioSecurityDao;

@Service("UsuarioSecurityService")
public class UsuarioSecurityService implements UserDetailsService {

    @Autowired
    private IUsuarioSecurityDao usuarioDao;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UsuarioSecurityEntity usuario = usuarioDao.findByUsername(username);
        List<GrantedAuthority> listaTipos = new ArrayList<>();

        if(usuario == null){
            throw new UsernameNotFoundException("Usuario o Contraseña Incorrecta");
        }else{
            for(TipoUsuarioEntity item:usuario.getTipo_usuarios()){
                listaTipos.add(new SimpleGrantedAuthority(item.getAuthority()));
            }
        }
        return new User(usuario.getUsername(), usuario.getUSER_CONTRASEÑA(), listaTipos);
    } 
}
