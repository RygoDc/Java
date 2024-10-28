public class Producto {
    private String cod;
    private String nombre;
    private int cantidad;
    private double precio;

    public Producto(){}

    public Producto(String cod, String nombre, int cantidad, double precio) {
        this.cod = cod;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return " " + " | " + nombre + " | " + cantidad +
                " | " + precio ;
    }
}
