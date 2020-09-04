package test;

import entidades.Producto;

public class TestProducto {
    public static void main(String[] args) {
        System.out.println("Hola");
        
        //Producto en una linea.
        Producto miProducto1 = new Producto("Coca Cola", 110);
        
        //Dos lineas
        //1. Declaro
        Producto miProducto2;
        //2. Inicializo
        miProducto2 = new Producto("Ravioles", 200);
        
        //miProducto1.setAdicional("Salsa blanca");
        //Si es papas fritas, le hago un 20% de descuento
        if (miProducto1.getAdicional().equals("Salsa blanca")) {
            System.out.println("Es igual");
        }else{
            System.out.println("No es iagul");
        }
        System.out.println(miProducto1.getAdicional());
        System.out.println(miProducto1);
        System.out.println("Chau");
    }
}
