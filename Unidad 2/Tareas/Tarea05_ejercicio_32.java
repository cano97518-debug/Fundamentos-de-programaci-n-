public class Tarea05_ejercicio_32 {
    public static void main(String[] args) {
        long producto = 1;
        int impar = 1;

        for (int i = 1; i <= 10; i++) {
            producto *= impar;
            impar += 2;
        }
        System.out.println("El producto de los 10 primeros números impares es: " + producto);
    }
}