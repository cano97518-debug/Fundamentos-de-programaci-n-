package a2261330031_estudiodecasoo;

public class CargarProductosS {
	public static String[][] CargarProductos() {
	    String[][] producto = {
	        { "001", "Arroz 1kg", "35", "10" },
	        { "002", "Azúcar 1kg", "25", "10" },
	        { "003", "Harina 1kg", "28", "10" },
	        { "004", "Aceite 1L", "50", "10" },
	        { "005", "Leche 1L", "35", "10" },
	        { "006", "Huevos 12 unidades", "45", "10" }, // Nota: corregido el orden precio/stock del PDF
	        { "007", "Fideos 500g", "20", "10" },
	        { "008", "Sal 1kg", "15", "10" },
	        { "009", "Pasta de tomate 400g", "25", "10" },
	        { "010", "Atún lata 170g", "35", "10" }
	    };
	    return producto;
	}

}
