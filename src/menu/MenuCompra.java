package menu;

public class MenuCompra {
	
	private static final String INICIO_COMPRA = 
	        "(L) Listar productos seleccionados:\n" +
	        "(B) Buscar producto\n" +
	        "(S) Salir del programa\n" +
	        "Selecciona una opción: ";

	private static final String ACCIONES = 
	        "Acciones:\n" +
	        "(F) Formalizar compra\n" +
	        "(R) Vaciar los productos seleccionados.\n" +
	        "(V) Volver al menú anterior.\n" +
	        "Selecciona una opción: ";
	
	private static final String CATEGORIAS = 
	        "-----------------------------------\n" +
	        "------ Listado de categorías ------\n" +
	        "-----------------------------------\n" +
	        "(A) Alimentación\n" +
	        "(L) Libros\n" +
	        "(D) Discos\n" +
	        "(V) Volver al menú anterior\n" +
	        "-----------------------------------\n" +
	        "Selecciona una opción: ";
	
	private static final String AGREGAR = 
	        "-----------------------------------\n" +
	        "Acciones:\n" +
	        "(A) Agregar producto al pedido\n" +
	        "(V) Volver al menú anterior\n";

	private static final String DETALLES_PRODUCTO = 
	        "-----------------------------------\n" +
	        "CODIGO DESCRIPCION PRECIO_NETO IMPUESTO TOTAL\n";
	
	
	
	public static void InicioCompra() {
		System.out.println(INICIO_COMPRA);
	}

	public static void Acciones() {
		System.out.println(ACCIONES);
	}

	public static void Categorias() {
		System.out.println(CATEGORIAS);
	}
	
	public static void Agregar() {
		System.out.println(AGREGAR);
	}

	public static void DetallesProducto() {
		System.out.println(DETALLES_PRODUCTO);
	}
}


