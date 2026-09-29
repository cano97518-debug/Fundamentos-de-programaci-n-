package a2261330031_practica4;

public class Ejercicio7 {
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 4;

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        double division = (double) num1 / num2;
        int modulo = num1 % num2;

        System.out.printf("Número 1: %d | Número 2: %d\n", num1, num2);
        System.out.println("------------------------------------");
        System.out.printf("Suma: %d + %d = %d\n", num1, num2, suma);
        System.out.printf("Resta: %d - %d = %d\n", num1, num2, resta);
        System.out.printf("Multiplicación: %d * %d = %d\n", num1, num2, multiplicacion);
        System.out.printf("División exacta: %d / %d = %.2f\n", num1, num2, division);
        System.out.printf("Módulo (residuo): %d %% %d = %d\n", num1, num2, modulo);
    }
}