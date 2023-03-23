package com.adecco.presentacion;

import com.adecco.modelo.Producto;

public class Main {
    public static void main(String[] args) {
       //instanciar que nos guardara en memora
        Producto p1 = new Producto();
        p1.setNumProducto(1);
        System.out.println("idproducto"+ p1.getNumProducto());
        p1.setNombreProducto("raton inalambrico");
        System.out.println("nombre producto-->" +p1.getNombreProducto());
        p1.setPrecio(5000);
        System.out.println("El precio es -->" +p1.getPrecio());
        p1.setCantidadExistencia(15);
        System.out.println("Cantidad en existencia -->"+p1.getCantidadExistencia());
    }


}