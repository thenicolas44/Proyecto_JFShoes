package com.jfproject.jfshoestore.model.Entity;

import java.io.Serializable;

import jakarta.persistence.*;


@Entity
@Table(name = "TIPO_USUARIOS")
public class TipoUsuarioEntity implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false, name = "TIPO_USER_ID")
    private Long id;
    @Column(name="TIPO_USER_ROL" , length=25 , nullable = false)
    private String authority;

    /* GETTERS AND SETTERS */

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getAuthority() {
        return authority;
    }
    public void setAuthority(String authority) {
        this.authority = authority;
    }
}