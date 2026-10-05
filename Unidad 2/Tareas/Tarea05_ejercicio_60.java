public class Tarea05_ejercicio_60 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        // Llenado de la matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = i + j;
            }
        }

        // Mostrar la matriz
        System.out.println("Matriz de 5x5 (i + j):");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}