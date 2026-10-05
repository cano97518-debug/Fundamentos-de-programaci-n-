import java.util.Scanner;

public class Tarea05_ejercicio_46 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] numeros = new double[5];
        double sumaPos = 0, sumaNeg = 0;
        int contPos = 0, contNeg = 0, ceros = 0;

        System.out.println("Introduzca 5 números:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Elemento [" + i + "]: ");
            numeros[i] = entrada.nextDouble();

            if (numeros[i] > 0) {
                sumaPos += numeros[i];
                contPos++;
            } else if (numeros[i] < 0) {
                sumaNeg += numeros[i];
                contNeg++;
            } else {
                ceros++;
            }
        }

        if (contPos > 0) System.out.println("Media de positivos: " + (sumaPos / contPos));
        else System.out.println("No hay números positivos.");

        if (contNeg > 0) System.out.println("Media de negativos: " + (sumaNeg / contNeg));
        else System.out.println("No hay números negativos.");

        System.out.println("Cantidad de ceros: " + ceros);
        entrada.close();
    }
}