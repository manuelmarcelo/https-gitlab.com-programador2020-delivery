package test;

import entidades.category.Categoria;
import java.util.ArrayList;

public class TestCategoriasClase {
    public static void main(String[] args) {
        //data-businesstype
        //Restaurantes
        //Mercados
        //Bebidas
        //Cafe y Deli
        //Kioskos
        //Farmacias
        //Tiendas
        Categoria miCategoria1 = new Categoria("Restaurantes");
        Categoria miCategoria2 = new Categoria("Mercados");
        Categoria miCategoria3 = new Categoria("Bebidas");
        Categoria miCategoria4 = new Categoria("Cafe y Deli");
        Categoria miCategoria5 = new Categoria("Kioskos");
        Categoria miCategoria6 = new Categoria("Farmacias");
        Categoria miCategoria7 = new Categoria("Tiendas");
        ArrayList<Categoria> listado = new ArrayList<>();
        listado.add(miCategoria1);
        listado.add(miCategoria2);
        listado.add(miCategoria3);
        listado.add(miCategoria4);
        listado.add(miCategoria5);
        listado.add(miCategoria6);
        listado.add(miCategoria7);
        System.out.println(listado);
    }
    
}
