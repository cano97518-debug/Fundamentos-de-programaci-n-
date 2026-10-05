public class Tarea05_ejercicio_78 {
    public static void main(String[] args) {
        int t[][] = new int[3][3];
        int aux;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Introduzca elemento[" + i + "][" + j + "]: ");
                t[i][j] = Entrada.entero();
            }
        }

        // Matriz original
        System.out.print("Matriz original:");
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.print(t[i][j] + " ");
            }
        }

        // Transposición intercambiando solo elementos por debajo de la diagonal principal
        for (int i = 1; i < 3; i++) {
            for (int j = 0; j < i; j++) {
                aux = t[i][j];
                t[i][j] = t[j][i];
                t[j][i] = aux;
            }
        }

        // Matriz transpuesta
        System.out.println();
        System.out.println("---------------------");
        System.out.println("Matriz transpuesta");
        for (int i = 2; i >= 0; i--) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.print(t[i][j] + " ");
            }
        }
    }
}