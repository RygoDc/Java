package Ejercicio3;

public class Estudiante {
    public String nombre;
    public double nota;

    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public Estudiante(){}

    @Override
    public String toString() {
        return nombre + "|" + nota ;
    }
}
