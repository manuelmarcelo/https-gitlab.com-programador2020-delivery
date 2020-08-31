package entidades.user;

public class Admin extends User {

    public Admin(String user, String pass) {
        super(user, pass);
    }

    public void verPedidosActuales() {
        System.out.println("Los pedidos actuales son... [Aca vienen los datos de la DB]");
    }

    public void verPedidosSemanales() {
        System.out.println("Los pedidos semanales son... [Aca vienen los datos de la DB]");
    }

    public void verPedidosQuincenales() {
        System.out.println("Los pedidos quincenales son... [Aca vienen los datos de la DB]");
    }
    
    public void pedidos(String desde, String hasta) {
    
    }

    public void bestSeller() {
        System.out.println("Los mas vendidos son... [Aca vienen los datos de la DB]");
    }

    public void bestShoppers() {
        System.out.println("Los mejores vendedores son... [Aca vienen los datos de la DB]");
    } //Para ofrecerle promociones

}
