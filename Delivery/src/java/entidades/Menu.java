package entidades;

public class Menu {
private String nombre;
private String Producto;
private int precio;

    public Menu(String nombre, String Producto, int precio) {
        this.nombre = nombre;
        this.Producto = Producto;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Menu{" + "nombre=" + nombre + ", Producto=" + Producto + ", precio=" + precio + '}';
    }


    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
}
