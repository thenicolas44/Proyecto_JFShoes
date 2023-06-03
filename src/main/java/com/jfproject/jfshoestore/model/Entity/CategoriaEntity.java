package com.jfproject.jfshoestore.model.Entity;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "CATEGORIAS")
public class CategoriaEntity implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CAT_ID")
    private Long id;

    @Column(name="CAT_SEXO")
    private String sexo;

    @Column(name="CAT_TEMPORADA")
    private String temporada;

    @Column(name="CAT_MODELO")
    private String modelo;

    @Column(name = "CAT_OCASION")
    private String ocasion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getOcasion() {
        return ocasion;
    }

    public void setOcasion(String ocasion) {
        this.ocasion = ocasion;
    }

    
}