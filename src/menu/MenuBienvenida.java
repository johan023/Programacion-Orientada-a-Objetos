package menu;

public class MenuBienvenida {
    private static final String MENU = 
        "/*********************************************/\n" +
        "/********** TIENDA VIRTUAL POO ***************/\n" +
        "/*********************************************/\n" +
        "-----------------------------------\n" +
        "(R) Usuario registrado\n" +
        "(A) Alta de usuario\n" +
        "(I) Usuario invitado\n" +
        "(S) Salir del programa\n" +
        "-----------------------------------\n" +
        "Selecciona una opción: ";

    public static void inicio() {
        System.out.println(MENU);
    }
}
