import java.util.Scanner;

public class Tarea05_ejercicio_34 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double num, sumaPos = 0, sumaNeg = 0;
        int contPos = 0, contNeg = 0, ceros = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            num = entrada.nextDouble();

            if (num > 0) {
                sumaPos += num;
                contPos++;
            } else if (num < 0) {
                sumaNeg += num;
                contNeg++;
            } else {
                ceros++;
            }
        }

        if (contPos > 0) System.out.println("Media de positivos: " + (sumaPos / contPos));
        else System.out.println("No se introdujeron números positivos.");

        if (contNeg > 0) System.out.println("Media de negativos: " + (sumaNeg / contNeg));
        else System.out.println("No se introdujeron números negativos.");

        System.out.println("Cantidad de ceros: " + ceros);
        entrada.close();
    }
}