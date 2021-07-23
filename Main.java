import Retos.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        boolean bandera = true;

        while(bandera) {
            System.out.println("--- Menu Opciones ---");
            System.out.println("1. Primer reto\n2. Segundo reto\n3. Tercer reto\n4. Cuarto reto\n5. Quinto reto\n0. Salir");
            System.out.println("---------------------");
            System.out.print("Opcion: ");
            Scanner scanner = new Scanner(System.in);
            Reto retos = new Reto();
            try {
                int opcion = scanner.nextInt();
                System.out.println("---------------------");
                switch(opcion) {
                    case 0:
                        bandera = false;
                        System.out.println("Hasta pronto...");
                        break;
                    case 1:
                        retos.doChallengeOne();
                        break;
                    case 2:
                        retos.doChallengeTwo();
                        break;
                    case 3:
                        retos.doChallengeThree();
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Por favor, elija una opcion valida.");
                        break;
                }
            } catch( Exception err) {
                System.out.println("---------------------");
                System.out.println("No es una opcion valida.");
            }
        }
    }
}



