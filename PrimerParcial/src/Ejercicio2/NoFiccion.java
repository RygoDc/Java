package Ejercicio2;

import java.io.Serializable;

public class NoFiccion extends Libro implements Serializable {
    private static final long serialVersionUID = 1L;
    private String campoEstudio;

    public NoFiccion(String id, String titulo, String autor, int paginas, String campoEstudio) {
        super(id, titulo, autor, paginas);
        this.campoEstudio = campoEstudio;
    }


    @Override
    public String toString() {
        return "NoFiccion{" +
                "campoEstudio='" + campoEstudio + '\'' +
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
