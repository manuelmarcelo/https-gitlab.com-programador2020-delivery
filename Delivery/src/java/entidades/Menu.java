package entidades;

public class Menu {
private String nombre;
private String Producto;

    public Menu(String nombre, String Producto) {
        this.nombre = nombre;
        this.Producto = Producto;
    }

    @Override
    public String toString() {
        return "Menu{" + "nombre=" + nombre + ", Producto=" + Producto + '}';
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
    
}
