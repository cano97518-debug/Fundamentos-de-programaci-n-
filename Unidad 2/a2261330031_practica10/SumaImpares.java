package a2261330031_practica10;
import java.util.Scanner;

public class SumaImpares {
    public static int calcularSumaImpares(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += (2 * i - 1);
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el valor de n: ");
        int n = sc.nextInt();

        int resultado = calcularSumaImpares(n);
        System.out.println("La suma de los primeros " + n + " números impares es: " + resultado);
    }
}