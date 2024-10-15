abstract class Dispositivos {
    protected String estado;
    protected String marca;

    public abstract void encender();

    @Override
    public String toString() {
        return "Dispositivos{" +
                "estado='" + estado + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
