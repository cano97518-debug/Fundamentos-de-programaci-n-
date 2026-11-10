package a2261330031_estudiodecaso;

public class Lee {
	public static String Leer(String texto) throws IOException {
	    String cadena = "";
	    cadena = Dialogo(texto);
	    if (cadena != null) {
	        cadena = cadena.trim();
	        if (cadena.isEmpty()) {
	            cadena = null;
	        }
	    } else {
	        cadena = null;
	    }
	    return cadena;
	}

}
