package entidades;

public class Seller extends User{
    String stock; //seria del pedido?
    String mediosHabilitadosDePago;
    String logo;
    String addres;
    String tiempoEntrega;
    String costoEnvío;
    boolean isVip;
    //reputacion
    
    public Seller(String user, String pass){
        super(user, pass);
    }
    void ofrecerPedidoParaRepartidor() {}
    void altaMenu(){}
}
