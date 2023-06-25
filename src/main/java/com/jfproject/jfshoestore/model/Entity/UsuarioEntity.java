package com.jfproject.jfshoestore.model.Entity;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name = "USUARIOS")
public class UsuarioEntity implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false, name = "USER_ID")
    private long id;

    @Column(name="USER_NOMBRE",length=50,nullable=false)
    private String nombre;
    @Column(name="USER_APELLIDO",length=100,nullable=false)
    private String apellido;
    @Column(name="USER_CORREO",length=30,nullable=false)
    private String correo;
    @Column(name="USER_CONTRASEÑA",length=10,nullable=false)
    private String contrasenia;
    @Column(name="USER_NICKNAME",length=15,nullable=false)
    private String nickname;
    @Column(name="USER_IDENTIFICACION",length=20,nullable=false)
    private String identificacion;
    @Column(name="USER_TIPOIDENTIFICACION",length=15,nullable=false)
    private String tipoIdentificacion;
    @Column(name = "USER_TIPO_USUARIO", columnDefinition = "VARCHAR2(100) DEFAULT 'Cliente'")
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
    public String getContrasenia() {
        return contrasenia;
    }
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
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
