package AnimalesSerializables2;

public class Mamifero extends Animal {

    private boolean tienePelo;

    public Mamifero(String name, int edad, boolean tienePelo) {
        super(name, edad);
        this.tienePelo = tienePelo;
    }

    public int getEdad() {
        return super.edad;
    }

    public boolean getTienePelo() {
        return this.tienePelo;
    }

    @Override
    public String toString() {
        return "Mamifero{" +
                "tienePelo=" + tienePelo +
                ", name='" + name + '\'' +
                ", edad=" + edad +
                '}';
    }
}
