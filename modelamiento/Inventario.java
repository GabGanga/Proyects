package modelamiento;

import java.util.ArrayList;

public class Inventario {
    Producto producto;
    ArrayList <Venta> ventas;

    public Inventario (Producto producto){
        this.producto = producto;
        ventas = new ArrayList<>();
    }
    public Producto getProducto(){
        return producto;
    }
    public boolean buscarProducto(String nombre){
        return false;
    }
    public boolean existeStock(String nombre, int cantidad){
        return false;
    }
    public boolean actualizarStock(String nombre, int cantidad){
        return false;
    }
    
}
