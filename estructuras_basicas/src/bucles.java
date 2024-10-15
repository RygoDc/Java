public class bucles {

    public static void main(String[] args) {

        //FOR recorre todos los elementos
        for (int i=0 ; i < 10 ; i++ ){
            System.out.println("Numero: " + i);
        }
        System.out.println("\n");
        int j = 0;
        boolean salir = false;
        while (j < 5 && !salir){ //salir == false
            System.out.println("Numero: " + j);

            if(j == 3){
                salir = true;
            }
            j++;
        }

        System.out.println("\n");
        int k = 0;
        do{
            System.out.println("Numero: " +k);
            k++;
        }
        while (k < 3);


    }
}
