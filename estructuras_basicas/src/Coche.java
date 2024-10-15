public class Coche extends Vehiculo{
    public int capacidadCombustible;

    public Coche(String marca, int velocidadMaxima, int capacidadCombustible) {
        super(marca, velocidadMaxima);
        this.capacidadCombustible = capacidadCombustible;
    }

    public int getCapacidadCombustible() {
        return capacidadCombustible;
    }

    public void setCapacidadCombustible(int capacidadCombustible) {
        this.capacidadCombustible = capacidadCombustible;
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando como un coche!");
    }

    @Override
    public String toString() {
        return "Coche{" +
                "capacidadCombustible=" + capacidadCombustible +
                ", marca='" + marca + '\'' +
                ", velocidadMaxima=" + velocidadMaxima +
                '}';
    }
}
