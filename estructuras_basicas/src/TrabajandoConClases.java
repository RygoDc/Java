public class TrabajandoConClases {
    public static void main(String[] args) {

//        Persona persona1 = new Persona("Sergio", 34,98);
//        Persona persona2 = new Persona();
//
//        System.out.println(persona1.getNombre());
//        System.out.println(persona1.getEdad());
//
//        System.out.println();
//
//        persona2.setNombre("Pepe");
//        persona2.setEdad(30);
//        persona2.setPeso(80);
//
//        System.out.println(persona2.toString());

//    Perro perro1 = new Perro("Duque",10);
//    perro1.hacerSonido();

//    Calculadora calculadora = new Calculadora();
//    try {
//        double resultado_division = calculadora.dividir(10,2);
//        System.out.println("Resultado division: " +resultado_division);
//
//        calculadora.dividir(10,0);
//    }
//    catch (ArithmeticException e){
//        System.out.println(e);
//    }

        Circulo circulo = new Circulo(5);
        circulo.mostrarFigura();
        System.out.println("El Área es: " + circulo.calcularArea());
        System.out.println("El Perimetro es: " + circulo.calcularPerimetro());
        circulo.mostrarDimensiones();

        System.out.println();
        Rectangulo rectangulo = new Rectangulo(5,10);
        rectangulo.mostrarFigura();
        System.out.println("El Área es: " + rectangulo.calcularArea());
        System.out.println("El Perimetro es: " + rectangulo.calcularPerimetro());

    }
}
