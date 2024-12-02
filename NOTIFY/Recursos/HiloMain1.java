package NOTIFY.Recursos;
class Recursos{
    private int numero;
    private boolean disponible = false;

    public synchronized void producir() throws InterruptedException{
        while (this.disponible){
            wait();
        }
        this.numero = (int) (Math.random()*100);
        System.out.println("Se ha generado un numero");
        this.disponible = true;
        notify();
    }

    public synchronized void consumir() throws InterruptedException{
        while(!this.disponible){
            wait();
        }
        System.out.println("El numero generado es: " +this.numero);
        this.disponible=false;
        notify();
    }

}
public class HiloMain1 {
    public static void main(String[] args) {
        Recursos recursos = new Recursos();

        Thread productor = new Thread(() ->{
            for (int i = 0; i < 5; i++) {
                try{
                    recursos.producir();
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Error: "+e);
                }
            }
        });

        Thread consumidor = new Thread(() ->{
            for (int i = 0; i < 5; i++) {
                try{
                    recursos.consumir();
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Error: "+e);
                }
            }
        });

        productor.start();
        consumidor.start();
    }

}
