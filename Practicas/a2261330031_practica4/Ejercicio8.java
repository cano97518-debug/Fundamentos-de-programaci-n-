package a2261330031_practica4;

public class Ejercicio8 {
    public static void main(String[] args) {
        double base = 12.5;
        double altura = 8.2;

        double area = base * altura;
        double perimetro = 2 * (base + altura);

        System.out.println("=== CÁLCULO DE FIGURA GEOMÉTRICA (RECTÁNGULO) ===");
        System.out.printf("Base: %.2f cm\n", base);
        System.out.printf("Altura: %.2f cm\n", altura);
        System.out.println("----------------------------------------------");
        System.out.printf("Área del rectángulo: %.2f cm²\n", area);
        System.out.printf("Perímetro del rectángulo: %.2f cm\n", perimetro);
    }
}