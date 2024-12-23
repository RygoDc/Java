package Ejercicio5;

public class Main {
    public static void main(String[] args) {
        Puente puente = new Puente();

        Thread cocheNorte1= new Thread(() ->{

            try{
                while(true) {
                    puente.cruzarNorte(1);
                    Thread.sleep((long) (Math.random() * 5000));
                }
            }
            catch (InterruptedException e){
                System.out.println("Error: "+e);
            }
        });
        Thread cocheNorte2= new Thread(() ->{
            try{
                while (true) {
                    puente.cruzarNorte(2);
                    Thread.sleep((long) (Math.random() * 5000));
                }
            }
            catch (InterruptedException e){
                System.out.println("Error: "+e);
            }
        });
        Thread cocheSur1= new Thread(() ->{
            try{
                while(true) {
                    puente.cruzarSur(1);
                    Thread.sleep((long) (Math.random() * 5000));
                }
            }
            catch (InterruptedException e){
                System.out.println("Error: "+e);
            }
        });
        Thread cocheSur2= new Thread(() ->{
            try{
                while (true){
                puente.cruzarSur(2);
                Thread.sleep((long) (Math.random() * 5000));
                }
            }
            catch (InterruptedException e){
                System.out.println("Error: "+e);
            }
        });
        cocheNorte1.start();
        cocheNorte2.start();
        cocheSur1.start();
        cocheSur2.start();
    }
}
