package entidades.db;

import entidades.category.Categoria;
import entidades.category.CategoriaListadoRAM;
import java.util.ArrayList;

public class DB {
    public static ArrayList<Categoria> consultar(){
        //Simulamos la conexion con la base de datos
        ArrayList<Categoria> listado = new ArrayList();
        Categoria miCategoria = new Categoria("Pizza");
        Categoria miCategoria2 = new Categoria("Vegano");
        Categoria miCategoria3 = new Categoria("Empanadas");
        Categoria miCategoria4 = new Categoria("Bebidas");
        Categoria miCategoria5 = new Categoria("Kiosco");
        listado.add(miCategoria);
        listado.add(miCategoria2);
        listado.add(miCategoria3);
        listado.add(miCategoria4);
        listado.add(miCategoria5);
        CategoriaListadoRAM.listado = listado;
        return listado;
    }
}
