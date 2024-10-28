package Ejercicio1;

import java.io.Serializable;

public class Libro implements Serializable,GestionableBiblioteca{
    private static final long serialVersionUID = 1L;
    public String titulo;
    public String autor;
    public int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public Libro(){}

    @Override
    public String getNombre() {
        return this.titulo;
    }

    @Override
    public String getTipo() {
        return "Libro";
    }

    @Override
    public String toString() {
        return "Libro{" +
                "Titulo='" + titulo + '\'' +
                ", Autor='" + autor + '\'' +
                ", Año de Publicacion=" + anioPublicacion +
                '}';
    }
}
