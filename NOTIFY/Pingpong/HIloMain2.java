package NOTIFY.Pingpong;

class PingPong {
    private boolean turno = false;

    public synchronized void ping() throws InterruptedException {
        while (this.turno) {
            wait();
        }
        System.out.println("PING");
        this.turno = true;
        notify();
    }

    public synchronized void pong() throws InterruptedException {
        while (!this.turno) {
            wait();
        }
        System.out.println("PONG");
        this.turno = false;
        notify();
    }
}

public class HIloMain2 {
    public static void main(String[] args) {
        PingPong pingPong = new PingPong();

        Thread pin = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                try{
                    pingPong.ping();
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Error: "+e);
                }
            }
        });

        Thread pon = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                try{
                    pingPong.pong();
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println("Error: " +e);
                }
            }
        });

        pin.start();
        pon.start();
    }
}
