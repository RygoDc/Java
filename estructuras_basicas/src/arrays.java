public class arrays {
    public static void main(String[] args) {
        int [] numeros ={10,20,30,40,50};

        for (int i = 0 ; i < numeros.length; i++){
            System.out.println("Numeros: " +numeros[i]);
        }

        int cont = 0;
        boolean val = false;
        while (cont < numeros.length && !val){
            if (numeros[cont] == 30){
                val = true;
            }
            else {
                System.out.println("Numero " +numeros[cont]);
                cont++;
            }
        }
        System.out.println("\n");
        int[][] matriz ={
                {1,2,3},
                {5,6,7},
                {8,9,10}
        };

        for (int j=0; j < matriz.length; j++){
            for (int k=0; k < matriz[j].length; k++){
                System.out.print(matriz[j][k] + " \t");
            }
            System.out.println();
        }
        System.out.println("\n");
        int filas = 0;
        boolean salir = false;

        while (filas < matriz.length && !salir){
            int columnas = 0;
            while (columnas < matriz[filas].length && !salir) {
                System.out.print(matriz[filas][columnas] + " \t");
                if (matriz[filas][columnas] == 7) {
                    salir = true;
                }
                columnas++;
            }
            filas++;
            System.out.println();
        }
    }


}
