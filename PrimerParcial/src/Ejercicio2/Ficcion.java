package Ejercicio2;

import java.io.Serializable;

public class Ficcion extends Libro implements Serializable {
    private static final long serialVersionUID = 1L;
    private String genero;

    public Ficcion(String id, String titulo, String autor, int paginas, String genero) {
        super(id, titulo, autor, paginas);
        this.genero = genero;
    }


    @Override
    public String toString() {
        return "Ficcion{" +
                "genero='" + genero + '\'' +
                '}';
    }

    @Override
    String getTitulo() {
        return "";
    }

    @Override
    String getAutor() {
        return "";
    }

}
