package com.jfproject.jfshoestore.model.Entity;

import java.io.Serializable;
import java.util.List;

import com.jfproject.jfshoestore.model.Entity.TipoUsuarioEntity;

import jakarta.persistence.*;

@Entity
@Table(name = "USUARIOS")
public class UsuarioEntity implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false, name = "USER_ID")
    private long id;

    @Column(name="USER_NAME",length=15,nullable = false)
    private String username;
    @Column(name="USER_CONTRASEÑA",length=80,nullable = false)
    private String contrasenia;
    @Column(name = "USER_ENABLE", nullable = false)
    private Boolean enable;
    
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "USER_ID")
    private List<TipoUsuarioEntity> tipo_usuarios;
    

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="PERSON_ID")
    private PersonaEntity personas;


    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }


    public String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username;
    }


    public String getContrasenia() {
        return contrasenia;
    }


    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }


    public Boolean getEnable() {
        return enable;
    }


    public void setEnable(Boolean enable) {
        this.enable = enable;
    }


    public List<TipoUsuarioEntity> getTipo_usuarios() {
        return tipo_usuarios;
    }


    public void setTipo_usuarios(List<TipoUsuarioEntity> tipo_usuarios) {
        this.tipo_usuarios = tipo_usuarios;
    }


    public PersonaEntity getPersonas() {
        return personas;
    }


    public void setPersonas(PersonaEntity personas) {
        this.personas = personas;
    }


    
}
