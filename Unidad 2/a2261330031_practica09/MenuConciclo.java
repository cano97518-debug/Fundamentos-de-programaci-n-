package a2261330031_practica09;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MenuConciclo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String opcion;
        
        do {
            System.out.println("\nMenu:");
            System.out.println("a.- Opcion 1");
            System.out.println("b.- Opcion 2");
            System.out.println("c.- Opcion 3");
            System.out.println("x.- Salir");
            System.out.print("Elige una opcion: ");
            opcion = reader.readLine();
            
            switch (opcion.toLowerCase()) {
                case "a":
                    System.out.println("Has elegido la Opcion 1");
                    break;
                case "b":
                    System.out.println("Has elegido la Opcion 2");
                    break;
                case "c":
                    System.out.println("Has elegido la Opcion 3");
                    break;
                case "x":
                    System.out.println("Adios, saliendo del menú.");
                    break;
                default:
                    System.out.println("Opción invalida");
                    break;
            }
        } while (!opcion.equalsIgnoreCase("x"));
    }
}


