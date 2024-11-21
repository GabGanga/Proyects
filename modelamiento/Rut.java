package modelamiento;

public class Rut {
    private long numero;
    private char dv;

    public Rut(long num, char dv){
        this.numero = num;
        this.dv = dv;
    }
   @Override
   public String toString() {
       return super.toString();
   }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    public boolean isValid (String rut){
        return false;
    }
    //POR HACER
    public Rut valueOf(String string){
        return null;
    }
}
