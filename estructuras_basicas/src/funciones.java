public class funciones {


    public static void HelloWord(){
        System.out.println("Hola Mundo");
    }

    public static boolean esVerdadero(String palabra){
        if (palabra.equals("Lunes"))
            return true;
        else
            return false;
    }

    public static String DiaDeLaSemana(int dia){
        switch (dia){
            case 1:
                return  "Lunes";
            case 2:
                return  "Martes";
            default:
                return  "Otro dia";
        }
    }





    public static void main(String[] args) {
        HelloWord();
        String palabra = "Lunes";
        boolean esLunes = esVerdadero(palabra);
        System.out.println("Es Lunes" +esLunes);
        System.out.println();

    }

}
