import java.util.Scanner;

public class Tarea05_ejercicio_18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dia, mes, anio;

        System.out.print("Día: ");
        dia = entrada.nextInt();
        System.out.print("Mes: ");
        mes = entrada.nextInt();
        System.out.print("Año: ");
        anio = entrada.nextInt();

        dia++;
        if (dia > 30) {
            dia = 1;
            mes++;
            if (mes > 12) {
                mes = 1;
                anio++;
            }
        }

        System.out.println("El día siguiente es: " + dia + " / " + mes + " / " + anio);

        entrada.close();
    }
}