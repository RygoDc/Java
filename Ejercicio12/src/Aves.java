public class Aves extends Animal{
    public boolean puedeVolar;

    public Aves(String nombre, int edad, boolean puedeVolar) {
        super(nombre, edad);
        this.puedeVolar = puedeVolar;
    }

    @Override
    public String toString() {
        return "Aves{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                "puedeVolar=" + puedeVolar +
                '}';
    }
}
