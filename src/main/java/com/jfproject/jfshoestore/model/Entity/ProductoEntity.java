package com.jfproject.jfshoestore.model.Entity;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name="PRODUCTOS")
public class ProductoEntity implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false, name="PRODUCT_ID")
    private long id;

    @Column(name="PRODUCT_NOMBRE",length=100,nullable=false)
    private String nombre_producto;

    @Column(name = "PRODUCT_PRECIO", nullable = false)
    private float precio;

    @Column(name="PRODUCT_DESCRIPCION",length=250,nullable=false)
    private String descripcion;

    @Column(name="PRODUCT_COLOR",length=250,nullable=false)
    private String color;

    @Column(name="PRODUCT_TALLA",nullable=false)
    private Integer talla;
    
    @ManyToOne(fetch=FetchType.LAZY,optional=false)
    @JoinColumn(name="CAT_ID")
    private CategoriaEntity categoria;
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNombre_producto() {
        return nombre_producto;
    }
    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Integer getTalla() {
        return talla;
    }
    public void setTalla(Integer talla) {
        this.talla = talla;
    }
    public CategoriaEntity getCategoria() {
        return categoria;
    }
    public void setCategoria(CategoriaEntity categoria) {
        this.categoria = categoria;
    }

    
    
    
}
