package producto;

import interfaz.IMostrable;

public class Disco extends Producto {
	private String nombreArtista;
    private String genero;

    public Disco(String codigo, String descripcion, double precioNeto, String nombreArtista, String genero) {
        super(codigo, descripcion, precioNeto, Categoria.DISCO);
        this.nombreArtista = nombreArtista;
        this.genero = genero;
    }

    public String getNombreArtista() {
        return nombreArtista;
    }

    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
