public class Tarea05_ejercicio_75 {
    public static void main(String[] args) {
        int t[][]; // Definimos t como una tabla bidimensional
        t = new int[5][5]; // Creamos la tabla de 5x5

        for (int i = 0; i < 5; i++) { // Utilizamos i para la primera dimensión
            for (int j = 0; j < 5; j++) { // Utilizamos j para la segunda dimensión
                t[i][j] = i + j;
            }
        }

        System.out.println("TABLA: ");
        for (int i = 4; i >= 0; i--) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                System.out.print(t[i][j] + " ");
            }
        }
    }
}


