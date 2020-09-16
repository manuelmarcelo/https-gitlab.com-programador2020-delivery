package entidades;

import entidades.category.Categoria;
import java.util.ArrayList;

public class Restaurant {

    private int id;
    private String name;
    private ArrayList<Categoria> businesstype;
    private String direccion;
    private ArrayList<Object> paymentMethodsList;
    private String deliveryTime;
    private String shippingAmount;
    private String minDeliveryAmount;    
    public ArrayList<Menu> listaMenu;

    public Restaurant(String name, ArrayList<Categoria> businesstype) {
        this.name = name;
        this.businesstype = businesstype;
    }

    @Override
    public String toString() {
        return "Restaurant{" + "id=" + id + ", name=" + name + ", businesstype=" + businesstype + ", direccion=" + direccion + ", paymentMethodsList=" + paymentMethodsList + ", deliveryTime=" + deliveryTime + ", shippingAmount=" + shippingAmount + ", minDeliveryAmount=" + minDeliveryAmount + ", listaMenu=" + listaMenu + '}';
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Object> getPaymentMethodsList() {
        return paymentMethodsList;
    }

    public void setPaymentMethodsList(ArrayList<Object> paymentMethodsList) {
        this.paymentMethodsList = paymentMethodsList;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getShippingAmount() {
        return shippingAmount;
    }

    public void setShippingAmount(String shippingAmount) {
        this.shippingAmount = shippingAmount;
    }

    public String getMinDeliveryAmount() {
        return minDeliveryAmount;
    }

    public void setMinDeliveryAmount(String minDeliveryAmount) {
        this.minDeliveryAmount = minDeliveryAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Categoria> getBusinesstype() {
        return businesstype;
    }

    public void setBusinesstype(ArrayList<Categoria> businesstype) {
        this.businesstype = businesstype;
    }

}
