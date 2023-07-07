package com.jfproject.jfshoestore.model.service.Service_UsuarioSecurity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jfproject.jfshoestore.model.Entity.TipoUsuarioEntity;
import com.jfproject.jfshoestore.model.Entity.UsuarioEntity;
import com.jfproject.jfshoestore.model.dao.IUsuarioDao;

@Service("UsuarioSecurityService")
public class UsuarioSecurityService implements UserDetailsService {

    @Autowired
    private IUsuarioDao usuarioDao;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UsuarioEntity usuario = usuarioDao.findByUsername(username);
        /* */
        List<GrantedAuthority> listaTipos = new ArrayList<>();
        Set<GrantedAuthority> authorities = new HashSet<>();
        if(usuario == null){
            throw new UsernameNotFoundException("Usuario o Contraseña Incorrecta");
        }else{
            for(TipoUsuarioEntity item:usuario.getTipo_usuarios()){
                listaTipos.add(new SimpleGrantedAuthority(item.getAuthority()));
            }
        }
        
        return new User(usuario.getUsername(), usuario.getContrasenia(),usuario.getEnable(),true,true,true, listaTipos);
    } 
}
