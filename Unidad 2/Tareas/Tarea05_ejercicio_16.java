import java.util.Scanner;

public class Tarea05_ejercicio_16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dia, mes, anio;

        System.out.print("Día: ");
        dia = entrada.nextInt();
        System.out.print("Mes: ");
        mes = entrada.nextInt();
        System.out.print("Año: ");
        anio = entrada.nextInt();

        if (dia >= 1 && dia <= 30 && mes >= 1 && mes <= 12 && anio > 0) {
            System.out.println("Fecha correcta.");
        } else {
            System.out.println("Fecha incorrecta.");
        }

        entrada.close();
    }
}