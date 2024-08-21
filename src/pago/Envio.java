package pago;

import java.util.Scanner;

import menu.MenuEnvio;

public class Envio {
	public static void procesoDeEnvio() {
		Scanner scanner = new Scanner(System.in);
		MenuEnvio.paso2();
		
        String direccionEnvio1 = scanner.next().toUpperCase();
        MenuEnvio.paso3();
        
        String opcionTarjeta = scanner.next().toUpperCase();
        
        switch (opcionTarjeta) {
            case "P":
                System.out.print("Usuario PayPal: ");
                String usuarioPaypal = scanner.next();

                System.out.print("Fecha de alta de la cuenta PayPal: ");
                String fechaAltaPaypal = scanner.next();

                MenuEnvio.paso4();
                String opcionConfirmacion = scanner.next().toUpperCase();

                switch (opcionConfirmacion) {
                    case "R":
                        System.out.println("PEDIDO REALIZADO CORRECTAMENTE, ESPERAMOS VERLE PRONTO EN NUESTRA TIENDA");
                        break;
                    case "D":
                    	System.out.println("PEDIDO DESCARTADO");
                        break;
                    case "V":
                        break;
                    default:
                        break;
                }
                
                break;

            case "T":
            	System.out.print("Tipo de tarjeta de crédito: ");
                String tipoTarjeta = scanner.next();
            	
            	System.out.print("Número de tarjeta: ");
                String numeroTarjeta = scanner.next();

                System.out.print("Fecha de caducidad de la tarjeta: ");
                String fechaCaducidad = scanner.next();

                System.out.print("CVC: ");
                String cvc = scanner.next();

                System.out.print("Titular que aparece en la tarjeta de crédito: ");
                String titular = scanner.next();

                break;

            case "V":
                break;
        }
	}
}
