package Modelos;

public class Gorila extends Animal {
    public Gorila(double peso, double altura) {
        super();
        this.setPeso(peso);
        this.setAltura(altura);
    }
    
    public double getPesoAlims() {
        Alimento[] alimentos = this.getAlimsIngeridos();
        int pesoAlims = 0;
        for(int i = 0; i < alimentos.length; i++) {
            pesoAlims += alimentos[i].getGramos();
        }
        return pesoAlims;
    }
    
    public double getIMC() {
        return (this.getPeso() + (this.getPesoAlims() / 1000 )) / Math.pow(this.getAltura(), 2);
    }
}