package web;

import com.google.gson.Gson;
import entidades.Menu;
import entidades.Restaurant;
import entidades.category.Categoria;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "MenuRestaurant", urlPatterns = {"/MenuRestaurant"})
public class MenuRestaurant extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Gson convertir = new Gson();
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
        
        resp.getWriter().print(convertir.toJson(listaMenu));
    }


}
