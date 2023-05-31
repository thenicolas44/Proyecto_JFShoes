package com.jfproject.jfshoestore.model.Entity;

import jakarta.persistence.*;


@Entity
@Table(name = "usuario")
public class UsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false, name = "user_id")
    private long id;

    @Column(name="user_NOMBRE",length=50,nullable=false)
    private String nombre;
    @Column(name="user_APELLIDO",length=100,nullable=false)
    private String apellido;
    @Column(name="user_CORREO",length=30,nullable=false)
    private String correo;
    @Column(name="user_CONTRASEÑA",length=10,nullable=false)
    private String contraseña;
    @Column(name="user_NICKNAME",length=15,nullable=false)
    private String nickname;
    @Column(name="user_IDENTIFICACION",length=20,nullable=false)
    private String identificacion;
    @Column(name="user_TIPO_IDENTIFICACION",length=8,nullable=false)
    private String tipoIdentificacion;
    @Column(name = "user_TIPO_USUARIO", length = 15, nullable = false ,columnDefinition = "VARCHAR2(8) DEFAULT 'Cliente'")
    private String tipoUsuario;
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getIdentificacion() {
        return identificacion;
    }
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }
    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }
    public String getTipoUsuario() {
        return tipoUsuario;
    }
    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    
}
