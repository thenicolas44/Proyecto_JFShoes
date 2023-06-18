package com.jfproject.jfshoestore.model.Entity;

import java.math.BigDecimal;
import jakarta.persistence.*;

@Entity
@Table(name="producto")
public class ProductoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false, name="product_id")
    private long id;
    @Column(name="product_nombre",length=100,nullable=false)
    private String nombre_producto;
    @Column(name = "product_precio", precision = 10, scale = 2, nullable = false)
    private BigDecimal precio;
    @Column(name="product_descripcion",length=250,nullable=false)
    private String descripcion;
    @Column(name="product_color",length=250,nullable=false)
    private String color;
    @Column(name="product_talla",nullable=false)
    private Integer talla;
    @ManyToOne(fetch=FetchType.LAZY,optional=false)
    @JoinColumn(name="categoria_id")
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
    public BigDecimal getPrecio() {
        return precio;
    }
    public void setPrecio(BigDecimal precio) {
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
