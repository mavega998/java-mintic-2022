package Retos;

import Modelos.*;
import java.util.Scanner;

public class Reto {

    public void doChallengeOne() {
        System.out.println("--- Calculo de Bono ---");
        boolean done = false;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Bono: ");
            int bono = scanner.nextInt();
            System.out.print("Anios: ");
            int anio = scanner.nextInt();
            System.out.println(this.calcularPorcentajeBono(anio, bono));
        } catch(Exception err) {
            System.out.println("---------------------");
            System.out.println("No es un numero valido");
            System.out.println("---------------------");
            this.doChallengeOne();
        }     
    }

    private static double calcularPorcentajeBono(int anios,float bono) {
        double porcentaje;
        porcentaje = 0.0;
        if (anios >= 10) {
            porcentaje = 0.3;
        } else if (anios >= 5 && anios < 10) {
            porcentaje = 0.2;
        } else if (anios >= 3 && anios < 5) {
            porcentaje = 0.1;
        } else if (anios < 3) {
            porcentaje = 0.05;
        }
        return porcentaje*bono;
    }

    public void doChallengeTwo() {
        System.out.println("--- Creando Usuario ---");
        Usuario obj = new Usuario("Lucia Gomez", 1097000000, "lucia.gomez@correo.com", 25, "desarrollo", true);
        obj.info();
    }

    public void doChallengeThree() {
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