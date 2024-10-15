public class Vehiculo {
    public String marca;
    public int velocidadMaxima;

    public Vehiculo(String marca, int velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void acelerar(){
        System.out.println("Acelerando");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }


    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", velocidadMaxima=" + velocidadMaxima +
                '}';
    }
}
