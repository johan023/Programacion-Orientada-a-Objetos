package menu;

public class MenuEnvio {
	
	private static final String PASO1 = 
	
		"-----------------------------------\n" +
		"A continuación, le guiaremos en el proceso de compra del pedido, para ello pasará por los siguientes pasos:\n" + 
		"Paso 1. Opción de envío\n" +
		"Paso 2. Dirección de envío\n" +
		"Paso 3. Forma de pago\n" +
		"Paso 4. Resumen y confirmación\n" + 
		"-----------------------------------\n\n" +
    
		"Paso 1. Opción de envío\n" + 

		"-----------------------------------\n" +
		"(1) Entrega hoy (9,99€, mismo día)\n" +
		"(2) Envío 1 día (5€, al día siguiente)\n" +
		"(3) Envío exprés (3,45€, 3 días laborales)\n" +
		"(4) Envío estándar (gratis, 5 días laborales)\n" +
		"(V) Volver al menú anterior.\n" +
	
		"Selecciona una opción: ";
    
	
	private static final String PASO2 = 
		"Paso 1 >> Paso 2. Dirección de envío\n" + 
		"Introduzca la dirección de envío: ";

	
	private static final String PASO3 = 
		"Paso 1 >> Paso 2 >> Paso 3. Forma de pago: \n" + 
		"-----------------------------------\n" + 
		"(P) Paypal \n" + 
		"(T) Tarjeta de crédito \n" + 
		"(V) Volver al menú anterior. \n";
	
	
	private static final String PASO4 = 
		"-----------------------------------\n" + 
		"Paso 1 >> Paso2 >> Paso3 >> Paso4. Resumen y confirmación\n" + 
		"-----------------------------------\n\n" +
		
		"-----------------------------------\n" +
		"Paso 4. Resumen y confirmación:\n" +
		"-----------------------------------\n\n" +
		
		"(R) Realizar pedido\n" +
		"(D) Descartar pedido\n" +
		"(V) Volver al menú anterior.\n\n" +
		
		"Seleccione una opción: ";

	
	
    
	public static void paso1() {
        System.out.println(PASO1);
    }
	
    public static void paso2() {
        System.out.println(PASO2);
    }
    
    public static void paso3() {
        System.out.println(PASO3);
    }
    
    public static void paso4() {
        System.out.println(PASO4);
    }
}

