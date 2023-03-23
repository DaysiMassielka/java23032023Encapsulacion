package com.adecco.modelo;

public class Producto {
    //Definir atributos
    private int numProducto;
    private  String nombreProducto;

    private double precio;

    private int cantidadExistencia;

    //metodos
    //constructores
    //Setters y Gettes para asignar valor al atributo
    public void setNumProducto(int numProducto){  //este es unmetodo
        this.numProducto =numProducto;
    }
    public int getNumProducto(){
        return numProducto;
    }
    public void setNombreProducto(String nombreProducto){
        this.nombreProducto = nombreProducto;
    }
    public String getNombreProducto(){
        return nombreProducto;
    }
//



    public void setPrecio(double Precio){  //este es unmetodo
        this.precio =precio;

        }
     public double getPrecio(){
        return precio;
     }

    public int getCantidadExistencia() {
        return cantidadExistencia;
    }

    public void setCantidadExistencia(int cantidadExistencia) {
        this.cantidadExistencia = cantidadExistencia;
    }
}
