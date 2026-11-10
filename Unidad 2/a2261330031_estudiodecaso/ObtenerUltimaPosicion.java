package a2261330031_estudiodecaso;

public class ObtenerUltimaPosicion {
	public static int ObtenerUltimaPosicion(String[][] matriz) {
	    int ultimaPosicion = -1;
	    for (int i = 0; i < matriz.length; i++) {
	        if (matriz[i][0] != null && !matriz[i][0].isEmpty()) {
	            ultimaPosicion = i;
	        }
	    }
	    return ultimaPosicion;
	}

}
