package EjPruebaE2;

class Pingpong{

    private boolean aviso = false;

    public synchronized void ping() throws InterruptedException{
        while (this.aviso){
            wait();
        }
        System.out.println("ping");
        this.aviso=true;
        notify();
    }

    public synchronized void pong() throws InterruptedException{
        while (!this.aviso){
            wait();
        }
        System.out.println("pong");
        this.aviso=false;
        notify();
    }

}

public class Main {
    public static void main(String[] args) {
        Pingpong pingpong = new Pingpong();

        Thread hilo1 = new Thread(() ->{
            for (int i = 0; i < 5; i++) {

                try {
                    pingpong.ping();
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Error: "+e);
                }
            }
        });

        Thread hilo2 = new Thread(() ->{
            for (int i = 0; i < 5; i++) {
                try {
                    pingpong.pong();
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println("Error: " + e);
                }
            }
        });

        hilo1.start();
        hilo2.start();
    }

    }


