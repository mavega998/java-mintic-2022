package Modelos;

public class Conejo extends Animal {
    private double longDientePrinc;
    
    public Conejo() {
        super();
    }
    
    public void setLongDientePrinc(double longitud) {
        this.longDientePrinc = longitud;
    }
    
    public double getLongDientePrinc() {
        return this.longDientePrinc;
    }
}