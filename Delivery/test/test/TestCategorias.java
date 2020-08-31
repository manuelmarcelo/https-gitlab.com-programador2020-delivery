package test;

import entidades.Categoria;
import java.util.ArrayList;

public class TestCategorias {

    public static void main(String[] args) {
        System.out.println("Hola");

        //1. Pedirlo a la base de datos, siempre
        //2. Se pida una vez a la base datos y se guarde en memoria RAM.
        System.out.println(TestCategorias.ConexionIneficienteBaseDedatos());

        System.out.println("Chau");
    }

    public static ArrayList ConexionEficienteBaseDedatos() {
        ArrayList<Categoria> listado = null;
        //1. Conectar a la base de datos 1 sola vez (categorias)
        //2. Dejar disponible las categorias en memoria RAM
        if (listado==null) {
            //Tenemos que consultar a la base de datos y poner las categorias en memoria RAM
            TestCategorias.ConexionIneficienteBaseDedatos();
        } else {
            //Las categorias ya estan en memoria RAM. Entonces ofrecemos este listado, sin molestar a la base de datos
            //Aca tenemos que usar el modificar Static
        }
        
        return listado;
    }

    //Simulamos que nos conectamos a una base de datos
    public static ArrayList ConexionIneficienteBaseDedatos() {
        //Una conexion nueva a la base de datos.
        //While para recorrer todo el resulSet
        //Cerrar la conexiuon de la base de datos
        ArrayList<Categoria> listado = new ArrayList();
        Categoria miCategoria = new Categoria("Tecnologia");
        Categoria miCategoria2 = new Categoria("Jardin");
        Categoria miCategoria3 = new Categoria("Muebles");
        Categoria miCategoria4 = new Categoria("Celulares");
        listado.add(miCategoria);
        listado.add(miCategoria2);
        listado.add(miCategoria3);
        listado.add(miCategoria4);
        return listado;
    }
}
