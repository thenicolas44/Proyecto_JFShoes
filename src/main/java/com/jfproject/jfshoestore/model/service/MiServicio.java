package com.jfproject.jfshoestore.model.service;

import org.springframework.stereotype.Service;

@Service

public class MiServicio implements IServicio{

    @Override
    public String nanmeProduct(int element) {
       if(element == 1){
        return "JUMMY";
       }
       if(element == 2){
        return "ADELE";
       }
       if(element == 3){
        return "ALBA";
       }
       else{
        return "error elemento no encontrado";
       }
    }

    @Override
    public String priceProduct(int element) {
        if(element == 1){
            return "200";
           }
           if(element == 2){
            return "300";
           }
           if(element == 3){
            return"219.00";
           }
           else{
            return "error elemento no encontrado";
           }
    }

    @Override
    public String descProduct(int element) {
        if(element == 1){
            return "Zapatos JUMMY con increible diseño para varones y mujeres";
           }
           if(element == 2){
            return "Zapatos ADELE para ocaciones especiales especialmente para ellos";
           }
           if(element == 3){
            return "Zapatos ALBA para ocaciones especiales especialmente para ellas";
           }
           else{
            return "error elemento no encontrado";
           }
    }

    @Override
    public String srcProduct(int element) {
        if(element == 1){
            return "/assets/imagenes/portfolio/Yummy_ProductoDestacado.jpg";
           }
           if(element == 2){
            return "/assets/imagenes/portfolio/Adele_ProductoDestacado.jpg";
           }
           if(element == 3){
            return "/assets/products/Alba.JPG";
           }
           else{
            return "/assets/imagenes/portfolio/not_found.png";
           }
    }
    
}
