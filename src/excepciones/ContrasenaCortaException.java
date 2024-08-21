package excepciones;

// Excepción que se lanza si la contraseña tiene menos de 8 caracteres
public class ContrasenaCortaException extends Exception {
    public ContrasenaCortaException(String mensaje) {
        super(mensaje);
    }
}
