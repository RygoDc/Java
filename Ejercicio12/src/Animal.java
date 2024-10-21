import java.io.Serializable;

public abstract class Animal implements Serializable,Gestionable {
    private static final long serialVersionUID = 1L;

    protected String nombre;
    protected int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Animal(){}

    public String getNombre() {
        return this.nombre;
    }

    public String getTipo(){
        return "Animal";
    }

    public int getEdad() {
        return edad;
    }



    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
