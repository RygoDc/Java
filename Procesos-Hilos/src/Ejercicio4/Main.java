package Ejercicio4;

public class Main {
    public static void main(String[] args) {
        Estacionamiento estacionamiento = new Estacionamiento(2);


        Thread coche1 = new Thread(() ->{
            try {
                while (true) {
                    estacionamiento.entrar(1);
                    Thread.sleep((long) (Math.random() * 5000));
                    estacionamiento.salir(1);
                }
            }catch (InterruptedException e){
                    System.out.println("Error: "+e);
                }
            });

        Thread coche2 = new Thread(() ->{
            try {
                while (true) {
                    estacionamiento.entrar(2);
                    Thread.sleep((long) (Math.random() * 5000));
                    estacionamiento.salir(2);
                }
            }catch (InterruptedException e){
                System.out.println("Error: "+e);
            }
        });
        Thread coche3 = new Thread(() ->{
            try {
                while (true) {
                    estacionamiento.entrar(3);
                    Thread.sleep((long) (Math.random() * 5000));
                    estacionamiento.salir(3);
                }
            }catch (InterruptedException e){
                System.out.println("Error: "+e);
            }
        });
        coche1.start();
        coche2.start();
        coche3.start();
        }

}
