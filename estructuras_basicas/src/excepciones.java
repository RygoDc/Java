public class excepciones {
    public static void ArithmeticExceptionFunction() {
        try{
            int resultado = 10/0;
            System.out.println(resultado);
        }
        catch (ArithmeticException e){
            System.out.println("El error procede de: " +e);
        }
    }

    public static void ArrayIndexExceptionFunction(){
        int [] numeros = {1,2,3,4};

        try {
            System.out.println(numeros[5]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(numeros[3]);
        }
    }

    public static void main(String[] args) {
        ArithmeticExceptionFunction();
        ArrayIndexExceptionFunction();
    }
}
