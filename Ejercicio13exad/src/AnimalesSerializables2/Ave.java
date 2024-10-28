package AnimalesSerializables2;

public class Ave extends Animal {

    private boolean puedeVolar;

    public Ave(String name, int edad, boolean puedeVolar) {
        super(name, edad);
        this.puedeVolar = puedeVolar;
    }

    public int getEdad() {
        return super.edad;
    }

    public boolean getPuedeVolar() {
        return this.puedeVolar;
    }

    @Override
    public String toString() {
        return "Ave{" +
                "puedeVolar=" + puedeVolar +
                ", name='" + name + '\'' +
                ", edad=" + edad +
                '}';
    }
}
