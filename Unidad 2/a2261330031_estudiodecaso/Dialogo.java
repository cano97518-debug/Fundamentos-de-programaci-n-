package a2261330031_estudiodecaso;

public class Dialogo {
	public static String Dialogo(String texto) throws IOException {
	    String cadena;
	    System.out.println(texto + " : ");
	    BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
	    cadena = lectura.readLine();
	    return cadena;
	}

}
