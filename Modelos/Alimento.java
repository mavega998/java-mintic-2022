package Modelos;

public class Alimento {
    private double gramos;
    
    public Alimento(double gramos) {
        this.setGramos(gramos);
    }
    
    public void setGramos(double gramos) {
        this.gramos = gramos;
    }
    
    public double getGramos() {
        return this.gramos;
    }
}