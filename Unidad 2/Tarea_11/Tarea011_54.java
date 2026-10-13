import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tarea011_54 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese la cadena principal: ");
            String str = reader.readLine();
            System.out.print("Ingrese los caracteres a buscar: ");
            String pat = reader.readLine();

            System.out.println("La cadena proporcionada es: " + str);
            System.out.println("Los personajes que se pueden encontrar en la cadena principal son: " + pat);
            
            int len1 = str.length();
            int len2 = pat.length();
            String res = "";
            if (len1 >= len2) {
                int[] hashPat = new int[256];
                int[] hashStr = new int[256];
                for (int i = 0; i < len2; i++) {
                    hashPat[pat.charAt(i)]++;
                }
                int start = 0, startIndex = -1, minLen = Integer.MAX_VALUE, count = 0;
                for (int j = 0; j < len1; j++) {
                    hashStr[str.charAt(j)]++;
                    if (hashPat[str.charAt(j)] != 0 && hashStr[str.charAt(j)] <= hashPat[str.charAt(j)]) {
                        count++;
                    }
                    if (count == len2) {
                        while (hashStr[str.charAt(start)] > hashPat[str.charAt(start)] || hashPat[str.charAt(start)] == 0) {
                            if (hashStr[str.charAt(start)] > hashPat[str.charAt(start)]) {
                                hashStr[str.charAt(start)]--;
                            }
                            start++;
                        }
                        int lenOfWindow = j - start + 1;
                        if (minLen > lenOfWindow) {
                            minLen = lenOfWindow;
                            startIndex = start;
                        }
                    }
                }
                if (startIndex != -1) {
                    res = str.substring(startIndex, startIndex + minLen);
                }
            }
            System.out.println("La ventana más pequeña que contiene los caracteres de búsqueda es: " + res);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}