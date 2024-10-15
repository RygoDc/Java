public class Cuadrado extends Figura{
    private double lado;

    public Cuadrado(int x, int y, String color, double lado) {
        super(x, y, color);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
//
//    @Override
//    public double calcularArea() {
//        return lado * lado;
//    }
//
//    @Override
//    public double calcularPerimetro() {
//        return 4 * lado;
//    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "lado=" + lado +
                ", color='" + color + '\'' +
                '}';
    }
}
