package test;

import entidades.Restaurant;
import entidades.category.Categoria;

public class TestRestaurant {
    public static void main(String[] args) {
        System.out.println("Hola");
        Categoria miCategoria1 = new Categoria("Restaurantes");
        Categoria miCategoria2 = new Categoria("Mercados");
        Categoria miCategoria3 = new Categoria("Bebidas");
        Categoria miCategoria4 = new Categoria("Cafe y Deli");
        Categoria miCategoria5 = new Categoria("Kioskos");
        Categoria miCategoria6 = new Categoria("Farmacias");
        Categoria miCategoria7 = new Categoria("Tiendas");
        Categoria miCategoria8 = new Categoria("Fast Food");
        Categoria miCategoria9 = new Categoria("Vegetariana");
        Categoria miCategoria10 = new Categoria("Mariscos");
        
        Restaurant elRestoDeYanina = new Restaurant("Como Todo!!!", miCategoria8);
        Restaurant elRestoDeFlorencia = new Restaurant("VeganoSaurio", miCategoria9);
        Restaurant elRestoDeLeandro = new Restaurant("Amorfar", miCategoria8);
        Restaurant elRestoDeFredy = new Restaurant("El ancla", miCategoria10);
        
        System.out.println(elRestoDeFlorencia);
        System.out.println(elRestoDeFredy);
        System.out.println(elRestoDeLeandro);
        System.out.println(elRestoDeYanina);
        
        System.out.println("Chau");
    }
}
