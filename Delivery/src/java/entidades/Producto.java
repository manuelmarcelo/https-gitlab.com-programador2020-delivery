package entidades;

public class Producto {
    private String nombre = "";
    private String descripcion = "";
    private float precio = 0;
    private String aclaraciones = ""; //VA EN EL PEDIDO
    private String foto = "";
    private String adicional = "";

    public Producto(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto(String nombre, String descripcion, float precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Producto(String nombre, String descripcion, float precio, String aclaraciones, String foto, String adicional) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.aclaraciones = aclaraciones;
        this.foto = foto;
        this.adicional = adicional;
    }
    
    
    
    
    
    //--------
    //menu
    //combos
    ////cantidad????? Donde ponemos cantidad?

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getAclaraciones() {
        return aclaraciones;
    }

    public void setAclaraciones(String aclaraciones) {
        this.aclaraciones = aclaraciones;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getAdicional() {
        return adicional;
    }

    public void setAdicional(String adicional) {
        this.adicional = adicional;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio + ", aclaraciones=" + aclaraciones + ", foto=" + foto + ", adicional=" + adicional + '}';
    }
    
    
}
