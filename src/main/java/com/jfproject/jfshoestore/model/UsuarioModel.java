package com.jfproject.jfshoestore.model;

import jakarta.persistence.*;


@Entity
@Table(name = "usuario")
public class UsuarioModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false, name = "user_id")
    private long id;

    @Column(name="NOMBRE",length=50,nullable=false)
    private String nombre;
    @Column(name="APELLIDO",length=100,nullable=false)
    private String apellido;
    @Column(name="CORREO",length=30,nullable=false)
    private String correo;
    @Column(name="CONTRASEÑA",length=10,nullable=false)
    private String contraseña;
    @Column(name="NICKNAME",length=15,nullable=false)
    private String nickname;
    @Column(name="IDENTIFICACION",length=20,nullable=false)
    private String identificacion;
    @Column(name="TIPO_IDENTIFICACION",length=8,nullable=false)
    private String tipoIdentificacion;

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
    
}
