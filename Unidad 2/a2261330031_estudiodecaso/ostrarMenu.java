package a2261330031_estudiodecaso;

public class ostrarMenu {
	public static String MostrarMenu(String[] opciones) {
	    String cadena = "";
	    for (String info : opciones) {
	        cadena += info + "\n";
	    }
	    return cadena;
	}

}
