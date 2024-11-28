package EjPruebaE2;

class PingPong{

    private boolean turnoPing= true;

    public synchronized void imprimirPing() throws InterruptedException{
        while(!this.turnoPing){
            wait();
        }
        System.out.println("Ping");
        this.turnoPing=false;
        notify();
    }
    public synchronized void imprimirPong() throws InterruptedException{
        while (this.turnoPing){
            wait();
        }
        System.out.println("Pong");
        this.turnoPing=true;
        notify();
    }
}

public class MainProfe {
    public static void main(String[] args) {


        PingPong pingpong = new PingPong();

        Thread ping = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    pingpong.imprimirPing();
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Error: " + e);
                }
            }
        });

        Thread pong = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    pingpong.imprimirPong();
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Error: " + e);
                }
            }
        });

        ping.start();
        pong.start();
    }
}


