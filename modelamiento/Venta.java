package modelamiento;

import java.time.LocalDate;

public class Venta {
    private LocalDate fecha;
    private int montoPagado, cantidad;
    private Inventario inventario;
    private Cliente cliente;

    public Venta(LocalDate fecha, int montoPagado, int cantidad, Inventario inv, Cliente cl){
        this.fecha = fecha;
        this.montoPagado = montoPagado;
        this.cantidad = cantidad;
        this.inventario = inv;
        this.cliente = cl;
    }
    public LocalDate getFecha(){
        return fecha;
    }
    public int getMontoPagado(){
        return montoPagado;
    }
    public int getCantidad(){
        return cantidad;
    }
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    public Inventario getInventario(){
        return inventario;
    }
    public Cliente getCliente(){
        return cliente;
    }
}
