public class Tarea05_ejercicio_66 {
    public static void main(String[] args) {
        int[][] marco = new int[8][6];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 0 || i == 7 || j == 0 || j == 5) {
                    marco[i][j] = 1;
                } else {
                    marco[i][j] = 0;
                }
            }
        }

        System.out.println("Matriz Marco de 8x6:");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(marco[i][j] + " ");
            }
            System.out.println();
        }
    }
}