package producto;

import interfaz.IMostrable;

public class Libro extends Producto {
	private String isbn;
    private String autor;

    public Libro(String codigo, String descripcion, double precioNeto, String isbn, String autor) {
        super(codigo, descripcion, precioNeto, Categoria.LIBRO);
        this.isbn = isbn;
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}

