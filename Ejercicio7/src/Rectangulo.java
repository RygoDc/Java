public class Rectangulo extends Figura {

    private double largo;
    private double ancho;

    public Rectangulo(int x, int y, String color, double largo, double ancho) {
        super(x, y, color);
        this.largo = largo;
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
//
//    @Override
//    public double calcularArea() {
//        return largo * ancho;
//    }
//
//    @Override
//    public double calcularPerimetro() {
//        return 2 * largo + 2 * ancho;
//    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "largo=" + largo +
                ", ancho=" + ancho +
                ", color='" + color + '\'' +
                '}';
    }
}
