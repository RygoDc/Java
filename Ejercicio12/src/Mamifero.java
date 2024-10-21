public class Mamifero extends Animal{
    public boolean tienePelo;

    public Mamifero(String nombre, int edad, boolean tienePelo) {
        super(nombre, edad);
        this.tienePelo = tienePelo;
    }


    @Override
    public String toString() {
        return "Mamifero{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ",tienePelo=" + tienePelo +
                '}';
    }
}
