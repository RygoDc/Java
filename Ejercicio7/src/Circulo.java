class Circulo extends Figura{

    private double radio;

    public Circulo(int x, int y, String color, double radio) {
        super(x, y, color);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
//    @Override
//    public double calcularArea(){
//        return Math.PI * Math.pow(this.radio,2);
//    }
//
//    @Override
//    public double calcularPerimetro(){
//        return 2 * Math.PI * this.radio;
//    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", color='" + color + '\'' +
                '}';
    }
}
