abstract class Figura {
    protected int x;
    protected int y;
    protected String color;

    public Figura(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }
//
//    public abstract double calcularArea();
//    public abstract double calcularPerimetro();

    @Override
    public String toString() {
        return "Figura{" +
                "x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }
}
