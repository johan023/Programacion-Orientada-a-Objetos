package menu;

import java.util.Scanner;

import cliente.GestorUsuarios;
import excepciones.CredencialesInvalidasException;
import otros.Compra;

public class Login {
	public static void Entrar(GestorUsuarios gestorUsuarios, Scanner scanner) {
		System.out.println("Seleccionaste Usuario registrado");
        
        System.out.print("Introduce tu correo: ");
        String correoR = scanner.next();
        
        System.out.print("Contrasena: ");
        String contrasenaR = scanner.next();
        
        // Lanzamos una excepción si el correo o la contraseña son incorrectos
        try {
            boolean credencialesValidas = gestorUsuarios.validarCredenciales(correoR, contrasenaR);

            if (credencialesValidas) {
                System.out.println("Bienvenido!");
                Compra.menuCompra();
            } else {
                throw new CredencialesInvalidasException("Correo o contrasena incorrectos. Inténtalo de nuevo.");
            }
        } catch (CredencialesInvalidasException e) {
            System.out.println(e.getMessage());
            System.exit(0); 
        }
    }
}
