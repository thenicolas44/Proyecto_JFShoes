package com.jfproject.jfshoestore.model;

import jakarta.persistence.*;

@Entity
@Table(name="producto")
public class ProductoModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false, name="product_id")
    private long id;
    private String nombre_producto;
    private Double precio;
    private String descripcion;
    private String color;
    private String talla;
    private String id_categoria;
    
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
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
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
    public String getTalla() {
        return talla;
    }
    public void setTalla(String talla) {
        this.talla = talla;
    }
    public String getId_categoria() {
        return id_categoria;
    }
    public void setId_categoria(String id_categoria) {
        this.id_categoria = id_categoria;
    }
}
