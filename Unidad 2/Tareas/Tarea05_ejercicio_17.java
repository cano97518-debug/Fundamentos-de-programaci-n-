import java.util.Scanner;

public class Tarea05_ejercicio_17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dia, mes, anio;
        boolean fechaValida = false;

        System.out.print("Día: ");
        dia = entrada.nextInt();
        System.out.print("Mes: ");
        mes = entrada.nextInt();
        System.out.print("Año: ");
        anio = entrada.nextInt();

        if (anio > 0 && mes >= 1 && mes <= 12) {
            if (mes == 2 && dia >= 1 && dia <= 28) {
                fechaValida = true;
            } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia >= 1 && dia <= 30) {
                fechaValida = true;
            } else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia >= 1 && dia <= 31) {
                fechaValida = true;
            }
        }

        if (fechaValida) {
            System.out.println("Fecha correcta.");
        } else {
            System.out.println("Fecha incorrecta.");
        }

        entrada.close();
    }
}