import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_21 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce la cadena: ");
        String str = reader.readLine();

        String part1 = "abcdefghij";
        String part2 = "klmnopqrst";
        String part3 = "uvwxyz";

        System.out.println(part1);
        System.out.println("==========");
        for (int i = 0; i < part1.length(); i++) {
            System.out.print(str.lastIndexOf(part1.charAt(i)) + " ");
        }
        System.out.println();

        System.out.println(part2);
        System.out.println("==========");
        for (int i = 0; i < part2.length(); i++) {
            System.out.print(str.lastIndexOf(part2.charAt(i)) + " ");
        }
        System.out.println();

        System.out.println(part3);
        System.out.println("======");
        for (int i = 0; i < part3.length(); i++) {
            System.out.print(str.lastIndexOf(part3.charAt(i)) + " ");
        }
        System.out.println();
    }
}