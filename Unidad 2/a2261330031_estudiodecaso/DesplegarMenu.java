package a2261330031_estudiodecaso;

public class DesplegarMenu {
	public static String DesplegarMenu(String Titulol, String[] menu) throws IOException {
	    String cadena;
	    cadena = Titulol + "\n" + "\n";
	    cadena = cadena + MostrarMenu(menu);
	    cadena = cadena + "\n Que opcion deseas";
	    return Dialogo(cadena);
	}

}
