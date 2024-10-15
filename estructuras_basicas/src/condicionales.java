public class condicionales {
    public static void main(String[] args) {
        boolean esVerdadero = true;
        String palabra = "hola";

        if(esVerdadero){
            System.out.println("Es verdadero");
        }
        else if (esVerdadero && palabra.equals("hola")){
            System.out.println("Es verdadero y la palabra es Hola");
        } else {
            System.out.println("No lo es");
        }
    }
}
