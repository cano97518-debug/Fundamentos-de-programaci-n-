package a2261330031_practica4;

public class Ejercicio9 {
    public static void main(String[] args) {
        double celsius = 28.5;
        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;

        System.out.println("=== CONVERSOR DE TEMPERATURA ===");
        System.out.printf("Temperatura inicial: %.2f °C\n", celsius);
        System.out.println("--------------------------------");
        System.out.printf("Equivalente en Fahrenheit: %.2f °F\n", fahrenheit);
        System.out.printf("Equivalente en Kelvin: %.2f K\n", kelvin);
    }
}