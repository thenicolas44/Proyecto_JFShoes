package com.jfproject.jfshoestore.model.Entity;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "PERSONAS")
public class PersonaEntity implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false, name = "PERSON_ID")
    private long id;

    @Column(name="PERSON_NOMBRE",length=50,nullable=false)
    private String nombre;
    @Column(name="PERSON_APELLIDO",length=50,nullable=false)
    private String apellido;
    @Column(name="PERSON_CORREO",length=50,nullable=false)
    private String correo;
    @Column(name="PERSON_IDENTIFICACION",length=8,nullable=false)
    private String identificacion;
    @Column(name="PERSON_TIPO_IDENTIFICACION",length=50,nullable=false)
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
