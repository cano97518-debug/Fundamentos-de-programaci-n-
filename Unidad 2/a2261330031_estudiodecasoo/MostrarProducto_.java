package a2261330031_estudiodecasoo;

public class MostrarProducto_ {
	public static String MostrarProducto(String[] vproducto) {
	    String codigo = RellenarEspacios(vproducto[0], 5);
	    String producto = RellenarEspacios(vproducto[1], 30);
	    String precio = RellenarEspacios(vproducto[2], 10);
	    String cantidad = RellenarEspacios(vproducto[3], 10);
	    String cadena = codigo.concat(producto + precio + cantidad);
	    return cadena;
	}

}
