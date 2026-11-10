package a2261330031_estudiodecaso;

public class EvaluarNumerico {
	public static boolean EvaluarNumerico(String dato, int tipo) {
	    boolean valido = false;
	    switch (tipo) {
	        case 1:
	            valido = EsNumeroEntero(dato);
	            break;
	        case 2:
	            valido = EsNumeroDouble(dato);
	            break;
	    }
	    return valido;
	}

}
