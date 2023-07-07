package com.jfproject.jfshoestore.model.Entity.UsuarioSecurity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class UsuarioSecurityEntity implements Serializable {
    
    /* Atributos de la Tabla Usuarios */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long USER_ID;
    @Column(name = "USER_NOMBRE")
    private String username;
    private String USER_APELLIDO;
    private String USER_CORREO;
    private String USER_CONTRASEÑA;
    private String USER_NICKNAME;
    private String USER_IDENTIFICACION;
    private String USER_TIPOIDENTIFICACION;
    private String USER_TIPO_USUARIO;
    private Boolean ENABLE;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private List<TipoUsuarioEntity> tipo_usuarios;

    /* Getters and Setters de la Tabla Usuarios */
    
    public Long getUSER_ID() {
        return USER_ID;
    }
    public void setUSER_ID(Long uSER_ID) {
        USER_ID = uSER_ID;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getUSER_APELLIDO() {
        return USER_APELLIDO;
    }
    public void setUSER_APELLIDO(String uSER_APELLIDO) {
        USER_APELLIDO = uSER_APELLIDO;
    }
    public String getUSER_CORREO() {
        return USER_CORREO;
    }
    public void setUSER_CORREO(String uSER_CORREO) {
        USER_CORREO = uSER_CORREO;
    }
    public String getUSER_CONTRASEÑA() {
        return USER_CONTRASEÑA;
    }
    public void setUSER_CONTRASEÑA(String uSER_CONTRASEÑA) {
        USER_CONTRASEÑA = uSER_CONTRASEÑA;
    }
    public String getUSER_NICKNAME() {
        return USER_NICKNAME;
    }
    public void setUSER_NICKNAME(String uSER_NICKNAME) {
        USER_NICKNAME = uSER_NICKNAME;
    }
    public String getUSER_IDENTIFICACION() {
        return USER_IDENTIFICACION;
    }
    public void setUSER_IDENTIFICACION(String uSER_IDENTIFICACION) {
        USER_IDENTIFICACION = uSER_IDENTIFICACION;
    }
    public String getUSER_TIPOIDENTIFICACION() {
        return USER_TIPOIDENTIFICACION;
    }
    public void setUSER_TIPOIDENTIFICACION(String uSER_TIPOIDENTIFICACION) {
        USER_TIPOIDENTIFICACION = uSER_TIPOIDENTIFICACION;
    }
    public String getUSER_TIPO_USUARIO() {
        return USER_TIPO_USUARIO;
    }
    public void setUSER_TIPO_USUARIO(String uSER_TIPO_USUARIO) {
        USER_TIPO_USUARIO = uSER_TIPO_USUARIO;
    }
    public Boolean getENABLE() {
        return ENABLE;
    }
    public void setENABLE(Boolean eNABLE) {
        ENABLE = eNABLE;
    }
    public List<TipoUsuarioEntity> getTipo_usuarios() {
        return tipo_usuarios;
    }
    public void setTipo_usuarios(List<TipoUsuarioEntity> tipo_usuarios) {
        this.tipo_usuarios = tipo_usuarios;
    }
}
