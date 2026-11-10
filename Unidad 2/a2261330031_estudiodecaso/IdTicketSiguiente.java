package a2261330031_estudiodecaso;

public class IdTicketSiguiente {
	public static String IdTicketSiguiente(String idticket) {
	    String idticketnext = "";
	    int num = Integer.parseInt(idticket) + 1;
	    if (num < 10) {
	        idticketnext = "00" + String.valueOf(num).trim();
	    } else if ((num > 9) && (num < 100)) {
	        idticketnext = "0" + String.valueOf(num).trim();
	    } else {
	        idticketnext = String.valueOf(num).trim();
	    }
	    return idticketnext;
	}

}
