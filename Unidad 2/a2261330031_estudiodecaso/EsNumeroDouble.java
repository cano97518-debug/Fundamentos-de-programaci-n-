package a2261330031_estudiodecaso;

public class EsNumeroDouble {
	public static boolean EsNumeroDouble(String dato) {
	    boolean valido = false;
	    for (char c : dato.toCharArray()) {
	        if (!Character.isDigit(c)) {
	            if (c == '.' && !valido) {
	                valido = true;
	            } else {
	                return false;
	            }
	        }
	    }
	    return valido;
	}

}
