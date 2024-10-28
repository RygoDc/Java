import java.io.Serializable;

abstract class Vehiculo implements Serializable {
    private static final long serialVersion = 1L;

    private String matricula;
    private String marca;
    private String modelo;
    private String ano;

    public Vehiculo(String matricula, String marca, String modelo, String ano) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public Vehiculo(){}

    abstract String TipoVehiculo();

    @Override
    public String toString() {
        return " "+ matricula + ";" + marca + ";" + modelo + ";" + ano;
    }
}
