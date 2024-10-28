public class Coche extends Vehiculo{
    String tipo;

    public Coche(String matricula, String marca, String modelo, String ano, String tipo) {
        super(matricula, marca, modelo, ano);
        this.tipo  = "coche";
    }

    @Override
    String TipoVehiculo() {
        return this.tipo;
    }
}
