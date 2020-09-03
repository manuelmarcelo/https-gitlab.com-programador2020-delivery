package test;

import entidades.category.Categoria;
import entidades.category.CategoriaListadoRAM;
import entidades.db.DB;
import java.util.ArrayList;

public class TestCategorias {

    public static void main(String[] args) {
        System.out.println("Hola");

        //1. Pedirlo a la base de datos, siempre
        //2. Se pida una vez a la base datos y se guarde en memoria RAM.
        //System.out.println(DB.consultar());
        
        //Consulte la base se datos
        //DB.consultar();
        
        
        
        if (CategoriaListadoRAM.listado.isEmpty()) {
            System.out.println("categorias de la DB");
            //Tenemos que buscar las categorias en la base de datos
            System.out.println(DB.consultar());            
        } 
            //Tenemos que pasarle al navegador el listado de categorias desde la RAM           
        
        System.out.println(CategoriaListadoRAM.listado);

        System.out.println("Chau");
    }
    

}
