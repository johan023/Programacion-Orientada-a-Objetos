package producto;

import java.util.ArrayList;

public class AlmacenarProductos { // Aquí se guardan todos los productos 
	public static ArrayList<Producto> obtenerProductosAlimentacion() {
        ArrayList<Producto> array = new ArrayList<Producto>();
        array.add(new Alimentacion("RF01", "Arroz de grano medio", 1.80, "18/03/2024"));
        array.add(new Alimentacion("RF02", "Espaguetis", 1.25, "02/03/2024"));
        array.add(new Alimentacion("RF03", "Aceite de oliva virgen extra", 7.15, "06/05/2024"));
        array.add(new Alimentacion("RF04", "Harina de trigo", 0.70, "29/04/2024"));
        array.add(new Alimentacion("RF05", "Azucar blanco", 1.45, "22/04/2024"));
        array.add(new Alimentacion("RF06", "Sal marina", 0.35, "12/07/2024"));
        array.add(new Alimentacion("RF07", "Leche desnatada", 0.85, "21/02/2024"));
        array.add(new Alimentacion("RF08", "12 huevos frescos", 2.25, "12/02/2024"));
        array.add(new Alimentacion("RF09", "Barra de pan", 0.45, "13/03/2024"));
        array.add(new Alimentacion("RF10", "1kg naranjas (Origen: Valencia)", 1.20 , "03/03/2024"));
        array.add(new Alimentacion("RF11", "Espinacas frescas", 1.60, "16/03/2024"));
        array.add(new Alimentacion("RF12", "Yogur griego", 1.60, "29/01/2024"));
        array.add(new Alimentacion("RF13", "Queso fresco de Burgos", 2.30, "02/02/2024"));
        array.add(new Alimentacion("RF14", "Atún enlatado (pack 6 latas)", 4.90, "06/02/2024"));
        array.add(new Alimentacion("RF15", "Lentejas", 0.85, "13/02/2024"));
        array.add(new Alimentacion("RF16", "Cereales", 1.40, "25/03/2024"));
        array.add(new Alimentacion("RF17", "Galletas Maria", 1.65 , "21/03/2024"));
        array.add(new Alimentacion("RF18", "Jamón ibérico de bellota (8kg)", 43.50, "16/08/2024"));

        return array;
    }

    public static ArrayList<Producto> obtenerProductosLibros() {
        ArrayList<Producto> array = new ArrayList<Producto>();
        array.add(new Libro("RF19", "1984", 15.00, "9780765326355", "George Orwell"));
        array.add(new Libro("RF20", "El principito", 11.00, "978014143947", "Antoine de Saint-Exupery"));
        array.add(new Libro("RF21", "Harry Potter y la piedra filosofal", 17.50 , "9780061120084", "J.K. Rowling"));
        array.add(new Libro("RF22", "El Diario de Greg", 9.50, "9780345803481", "Jeff Kinney"));
        array.add(new Libro("RF23", "El señor de los anillos", 22.30, "9780553296983", "J.R.R. Tolkien"));
        array.add(new Libro("RF24", "Los juegos del hambre", 18.70, "9780380002931", "Suzanne Collins"));
        array.add(new Libro("RF25", "After", 12.40, "9780316769488", "Anna Todd"));
        array.add(new Libro("RF26", "Saber Perder", 12.10, "9780679732761", "David Trueba"));
        array.add(new Libro("RF27", "El mundo de Sofia", 16.70, "9780441172719", "Jostein Gaarder"));
        array.add(new Libro("RF28", "La maldicion del maestro", 21.10, "9780553382560", "Laura Gallego Garcia"));
        array.add(new Libro("RF29", "Cronica de una muerte anunciada", 20.50, "9780743273565", "Gabriel Garcia Marquez"));
        array.add(new Libro("RF30", "Sistemas Ocultos", 14.60, "9780064400011", "Dan Nott"));

        return array;
    }
    
    
    public static ArrayList<Producto> obtenerProductosDiscos() {
    	ArrayList<Producto> array = new ArrayList<Producto>();
    	array.add(new Disco("RF31", "1989(Taylor's Version)", 3.50, "Pop", "Taylor Swift"));
        array.add(new Disco("RF32", "La Granja de Zenon 5", 2.10, "Infantil", "La Granja de Zenon"));
        array.add(new Disco("RF33", "Happier Than Ever", 3.70, "Pop", "Billie Eilish"));
        array.add(new Disco("RF34", "Un Verano Sin Ti", 2.80, "Pop", "Bad Bunny"));
        array.add(new Disco("RF35", "Black In Black", 4.00, "Rock", "AC/DC"));
        array.add(new Disco("RF36", "Discovery", 4.50, "Dance", "Daft Punk"));
        array.add(new Disco("RF37", "Future Nostalgia", 3.30, "Dance", "Dua Lipa"));
        array.add(new Disco("RF38", "McCartney III", 4.20, "Rock", "Paul McCartney"));
        array.add(new Disco("RF39", "Flakk Daniel's", 3.00, "Rock", "Rels B"));
        array.add(new Disco("RF40", ".mp3", 2.50, "Pop", "Emilia Mernes"));
        
        return array;
        
    }
}
