package com.jfproject.jfshoestore.model;

import jakarta.persistence.*;

@Entity
@Table(name="categoria")
public class CategoriaModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false,name = "categoria_id")
    private long id;
    private String sexo;
    private String temporada;
    private String modelo;
    private String ocacion;
    public long getId() {
        return id;
    }
    public void setId(long id) {
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
    public String getOcacion() {
        return ocacion;
    }
    public void setOcacion(String ocacion) {
        this.ocacion = ocacion;
    }

    
}
