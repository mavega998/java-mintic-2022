package Modelos;

public class Usuario {
    private String nombre;
    private int documento;
    private String email;
    private int edad;
    private String area;
    private boolean esJefeArea;

    public Usuario(String nombre, int documento, String email, int edad, String area, boolean esJefeArea) {
        this.nombre = nombre;
        this.documento = documento;
        this.email = email;
        this.edad = edad;
        this.area = area;
        this.esJefeArea = esJefeArea;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public boolean esJefeArea() {
        return esJefeArea;
    }

    public void esJefeArea(boolean esJefeArea) {
        this.esJefeArea = esJefeArea;
    }

    public void info() {
        double salario = 0.0;
        int smlv = 908526;

        if (this.getArea().equalsIgnoreCase("desarrollo")) {
            salario += 4500000;
        } else {
            salario += 3500000;
        }

        if (this.esJefeArea()) {
            if (this.getArea().equalsIgnoreCase("desarrollo")) {
                salario += 2500000;
            } else {
                salario += 3000000;
            }
        }

        double descuento = 0.08;

        if (salario > (smlv * 4)) {
            descuento += 0.01;
        }

        salario -= salario * descuento;

        System.out.print("[Usuario]:\nNombre: "+this.getNombre());
        System.out.print("\nIdentificacion: "+this.getDocumento());
        System.out.print("\nEmail: "+this.getEmail());
        System.out.print("\nEdad: "+this.getEdad());
        System.out.print("\nArea: "+this.getArea());
        System.out.println("\nSalario: "+ salario);
    }
}