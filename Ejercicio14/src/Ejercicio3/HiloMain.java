package Ejercicio3;


public class HiloMain {
    public static void main(String[] args) {
        Numeros numeros = new Numeros();

        Thread pares = new Thread(() ->{
            try {
                while (true){
                    numeros.pares();
                    Thread.sleep(1000);
                }

            }catch (InterruptedException e){
                    System.out.println("Error: "+e);
                }
            });

        Thread impares = new Thread(() ->{
            try {
                while (true){
                    numeros.impares();
                    Thread.sleep(1000);
                }

            }catch (InterruptedException e){
                System.out.println("Error: "+e);
            }
        });

        pares.start();
        impares.start();
    }
}
