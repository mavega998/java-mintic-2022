class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        // Animal nuevoAnimal = new Animal();
        // nuevoAnimal.setPeso(82.0);
        // nuevoAnimal.setAltura(1.78);
        // System.out.print("El IMC del animal x es, ");
        // System.out.println(nuevoAnimal.getIMC());
        
        // Conejo nuevoConejo = new Conejo();
        // nuevoConejo.setPeso(65.0);
        // nuevoConejo.setAltura(1.70);
        // nuevoConejo.setLongDientePrinc(3.0);
        // System.out.print("El IMC del conejo x es, ");
        // System.out.println(nuevoConejo.getIMC());
        // System.out.print("La longitud del diente principal del conejo es, ");
        // System.out.println(nuevoConejo.getLongDientePrinc());
        
        // Gorila nuevoGorila = new Gorila(40.0, 1.50);
        
        // System.out.print("El IMC del gorila x es, ");
        // System.out.println(nuevoGorila.getIMC());
        Alimento banana = new Alimento(120);
        Alimento raices = new Alimento(60);
        Alimento platano = new Alimento(78.5);
        Gorila gorila = new Gorila(150.5, 1.67);

        Alimento alimentos[] = new Alimento[3];
        alimentos[0] = banana;
        alimentos[1] = raices;
        alimentos[2] = platano;
        gorila.setAlimsIngeridos(alimentos);

        System.out.println(gorila.getPeso());
        System.out.println(gorila.getPesoAlims());        
        System.out.println(Math.round(gorila.getIMC()));
    }
}

class Alimento {
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

class Animal {
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

class Conejo extends Animal {
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

class Gorila extends Animal {
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