package test;

import entidades.Menu;
import entidades.Restaurant;
import entidades.category.Categoria;
import java.util.ArrayList;

public class TestMenuRestaurant {
    public static void main(String[] args) {
        System.out.println("Hola");
        //Requisistos del cliente                
        //1. El menu pertenece a un restaurant
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
        
        
        ArrayList<Categoria> listaCategoria = new ArrayList();
        listaCategoria.add(miCategoria4);        
        listaCategoria.add(miCategoria8);        
        Restaurant miResto = new Restaurant("Mc Donnals", listaCategoria);
        //miResto.menu = new Menu("Meriendas", "Cafe can leche, medialunas bien grasososas");
        
        System.out.println(miResto);


        //2. Quiero un menu que contenga los productos. 
        ArrayList<Menu> listaMenu = new ArrayList();
        Menu miMenu = new Menu("Desayunos y meriendas","tostado, cafe, Lagrima, Medialuna", 100);
        Menu miMenu2 = new Menu("Helados 50% OFF", "Mc Flurry y M & M's, Mc Flurry XXL", 200);
        listaMenu.add(miMenu);
        listaMenu.add(miMenu2);
        miResto.listaMenu = listaMenu;                
        
        System.out.println(miMenu);
        System.out.println(miMenu2);
        
        System.out.println(miResto);
        
        System.out.println("Chau");
    }
}
