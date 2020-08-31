package test;

import entidades.Admin;

public class TestAdmin {
    public static void main(String[] args) {
        System.out.println("Hola");
        //Instanciando la Clase
        Admin miAdmin = new Admin("Andres@gmail.com", "123");
        //Mostramos User y Pass
        System.out.println(miAdmin.getUser()+ " | " + miAdmin.getPass());
        
        //Asignar nombre por setter
        miAdmin.setName("Andres Gomez");
        //Mostrar nombre por getter
        System.out.println(miAdmin.getName());
        
        //PROBAMOS LOS METODOS        
        miAdmin.bestSeller();
        miAdmin.bestShoppers();
        miAdmin.verPedidosActuales();
        miAdmin.verPedidosQuincenales();
        miAdmin.verPedidosSemanales();
        
        
        System.out.println("Chau");
    }
}
