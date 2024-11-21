package modelamiento;

public class Producto {
    private String nombre;
    private TipoProducto tipoProducto;
    private int precio,stock;

    public Producto (String nombre,TipoProducto tipoProducto, int precio, int stock){
        this.nombre = nombre;
        this.tipoProducto = tipoProducto;
        this.precio = precio;
        this.stock = stock;
    }
    public int getPrecio(){
        return precio;
    }
    public void setPrecio(int precio){
        this.precio = precio;
    }
    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }
    public int getStock() {
        return stock;
    }
    public String getNombre() {
        return nombre;
    }
}
