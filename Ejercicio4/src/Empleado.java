public abstract class Empleado {
    protected String nombre;
    protected int salarioBase;
    protected int bono;

    public Empleado(String nombre, int salarioBase, int bono) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.bono = bono;
    }

    abstract void calcularSalario();

    abstract void mostrarInformacion();
}
