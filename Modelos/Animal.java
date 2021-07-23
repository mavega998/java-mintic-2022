package Modelos;

public class Animal {
    protected double peso;
    protected double altura;
    protected Alimento[] alimsIngeridos;
    
    public Animal() {}
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public double getPeso() {
        return this.peso;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double getAltura() {
        return this.altura;
    }
    
    public void setAlimsIngeridos(Alimento[] alimsIngeridos) {
        this.alimsIngeridos = alimsIngeridos;
    }
    
    public Alimento[] getAlimsIngeridos() {
        return this.alimsIngeridos;
    }
    
    public double getIMC() {
        return this.getPeso() / (Math.pow(this.getAltura(), 2));
    }
}