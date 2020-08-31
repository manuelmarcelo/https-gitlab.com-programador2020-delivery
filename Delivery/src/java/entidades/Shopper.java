package entidades;

public class Shopper extends User{    
    String addres;
    String PaymentMethod;
    String photo;
    boolean isVip;
    
    public Shopper(String user, String pass){
        super(user, pass);
    }
    
    void hacerPedido(){}
    void cancelarPedido(){
    //Tenes que pagar el delivery
    }
    void pagar(){}
}
