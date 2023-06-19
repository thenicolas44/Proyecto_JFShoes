package com.jfproject.jfshoestore.model.Entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.*;



@Entity
@Table(name = "COMPRAS")
public class CompraEntity implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false,name = "BUY_ID")
    private Long id;

    @Column(name = "BUY_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha_registro;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "USER_ID")
    private UsuarioEntity usuario;

    @PrePersist
    @PreUpdate
    public void asignarFecha(){
        fecha_registro = new Date();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public UsuarioEntity getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioEntity usuario) {
        this.usuario = usuario;
    }

    
}
