package Ejercicio2;

public abstract class Libro {

    private String id;
    private String titulo;
    private String autor;
    private int paginas;

    public Libro(String id, String titulo, String autor, int paginas) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public Libro(){}
    
    @Override
    public String toString() {
        return "Libro{" +
                "id='" + id + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", paginas=" + paginas +
                '}';
    }

    // Getters para los atributos
    public String getId() {
        return id;
    }

    abstract String getTitulo();

    abstract String getAutor();

    public int getPaginas() {
        return paginas;
    }

}
