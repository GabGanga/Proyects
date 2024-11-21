package modelamiento;

import java.util.ArrayList;

public class Cliente {
    private Rut rut;
    private String nombre,apellido, numTelefono;
    private ArrayList<Venta> ventas;
    private Venta[] ventasArr;


    public Cliente (Rut rut, String nom, String apellido, String numTelefono) {
        this.rut=rut;
        this.nombre=nom;
        this.apellido=apellido;
        this.numTelefono=numTelefono;
        ventas = new ArrayList<>();
        ventasArr = new Venta[ventas.size()];
    }

    public Rut getRut(){
        return rut;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getNum_Telefono(){
        return numTelefono;
    }
    public void setNumTelefono(String numTelefono){
        this.numTelefono=numTelefono;
    }
    public void addVenta(Venta venta){
        ventas.add(venta);
    }
    public Venta[] getVentas(){
        return ventas.toArray(ventasArr);
    }
    
}
