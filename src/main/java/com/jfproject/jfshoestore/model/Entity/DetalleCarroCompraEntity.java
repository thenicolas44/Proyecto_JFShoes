package com.jfproject.jfshoestore.model.Entity;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name = "DETALLE_CARRITO_COMPRA")
public class DetalleCarroCompraEntity implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false, name = "DETAIL_CART_ID")
    private Long id;

    @Column(name = "DETAIL_CART_CANTIDAD", nullable = false)
    private int cantidad;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PRODUCT_ID")
    private ProductoEntity producto;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CART_ID")
    private CarroCompraEntity carrito;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public ProductoEntity getProducto() {
        return producto;
    }

    public void setProducto(ProductoEntity producto) {
        this.producto = producto;
    }

    public CarroCompraEntity getCarrito() {
        return carrito;
    }

    public void setCarrito(CarroCompraEntity carrito) {
        this.carrito = carrito;
    }


}

    
    

