package excepciones;

// Excepción que se lanza si el correo o la contraseña son incorrectos
public class CredencialesInvalidasException extends Exception {
	public CredencialesInvalidasException(String mensaje) {
        super(mensaje);
    }
}
