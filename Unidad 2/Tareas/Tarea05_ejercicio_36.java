import java.util.Scanner;

public class Tarea05_ejercicio_36 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int edad, sumaEdad = 0, mayores18 = 0, mayores175 = 0;
        double altura, sumaAltura = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("--- Alumno " + i + " ---");
            System.out.print("Edad: "); edad = entrada.nextInt();
            System.out.print("Altura (m): "); altura = entrada.nextDouble();

            sumaEdad += edad;
            sumaAltura += altura;

            if (edad > 18) mayores18++;
            if (altura > 1.75) mayores175++;
        }

        System.out.println("Edad media: " + ((double) sumaEdad / 5));
        System.out.println("Altura media: " + (sumaAltura / 5));
        System.out.println("Alumnos mayores a 18 años: " + mayores18);
        System.out.println("Alumnos que miden más de 1.75m: " + mayores175);
        entrada.close();
    }
}