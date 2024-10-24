package Ejercicio6;

public class Main {
    public static void main(String[] args) {
        Ascensor ascensor = new Ascensor(3);

        Thread persona1 = new Thread(() ->{
            try {
                while (true) {
                    ascensor.entrar(1);
                    Thread.sleep(1000);
                    ascensor.salir(1);
                }
            }catch (InterruptedException e){
                System.out.println("Error: "+e);
            }
        });
        Thread persona2 = new Thread(() ->{
            try {
                while (true) {
                    ascensor.entrar(2);
                    Thread.sleep(1000);
                    ascensor.salir(2);
                }
            }catch (InterruptedException e){
                System.out.println("Error: "+e);
            }
        });
        Thread persona3 = new Thread(() ->{
            try {
                while (true) {
                    ascensor.entrar(3);
                    Thread.sleep(1000);
                    ascensor.salir(3);
                }
            }catch (InterruptedException e){
                System.out.println("Error: "+e);
            }
        });
        Thread persona4 = new Thread(() ->{
            try {
                while (true) {
                    ascensor.entrar(4);
                    Thread.sleep(1000);
                    ascensor.salir(4);
                }
            }catch (InterruptedException e){
                System.out.println("Error: "+e);
            }
        });
        Thread persona5 = new Thread(() ->{
            try {
                while (true) {
                    ascensor.entrar(5);
                    Thread.sleep(1000);
                    ascensor.salir(5);
                }
            }catch (InterruptedException e){
                System.out.println("Error: "+e);
            }
        });

        persona1.start();
        persona2.start();
        persona3.start();
        persona4.start();
        persona5.start();
    }
}
