public class Bicicleta extends Vehiculo{
    public String tipoBicicleta;

    public Bicicleta(String marca, int velocidadMaxima, String tipoBicicleta) {
        super(marca, velocidadMaxima);
        this.tipoBicicleta = tipoBicicleta;
    }

    public String getTipoBicicleta() {
        return tipoBicicleta;
    }

    public void setTipoBicicleta(String tipoBicicleta) {
        this.tipoBicicleta = tipoBicicleta;
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando como una Bicicleta!");
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "tipoBicicleta='" + tipoBicicleta + '\'' +
                ", marca='" + marca + '\'' +
                ", velocidadMaxima=" + velocidadMaxima +
                '}';
    }
}
