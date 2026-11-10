package a2261330031_estudiodecaso;

public class EsNumeroEntero {
	public static boolean EsNumeroEntero(String dato) {
	    for (char c : dato.toCharArray()) {
	        if (!Character.isDigit(c)) {
	            return false;
	        }
	    }
	    return true;
	}

}
