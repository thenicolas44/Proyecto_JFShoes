package com.jfproject.jfshoestore.model.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="categoria")
public class CategoriaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false,name = "categoria_id")
    private long id;
    @Column(name="user_sexo",length=10,nullable=false)
    private String sexo;
    @Column(name="user_temporada",length=20,nullable=false)
    private String temporada;
    @Column(name="user_modelo",length=20,nullable=false)
    private String modelo;
    @Column(name="user_ocacion",length=50,nullable=false)
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
