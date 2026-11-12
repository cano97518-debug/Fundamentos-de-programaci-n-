package a2261330031_estudiodecasoo;

public class ExisteProducto {
	public static int ExisteProducto(String codigo, String[][] vproductos) {
	    int enc, pos, tam, ciclo;
	    enc = -1;
	    pos = 0;
	    tam = vproductos.length;
	    for (ciclo = 0; ciclo < tam; ciclo++) {
	        if (vproductos[ciclo][0].compareTo(codigo.trim()) == 0) {
	            enc = pos;
	        }
	        pos++;
	    }
	    return enc;
	}

}
