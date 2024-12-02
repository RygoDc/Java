package NotifAll.FabricaNA;

class Chambear{
    private boolean puedenChambear = false;

    public synchronized void esperar(String nombre) throws InterruptedException{
        while(!this.puedenChambear){
            System.out.println("Trabajador "+nombre+" esperando autorizacion");
            wait();
        }
        System.out.println(nombre+" ha comenzado a chambear");
    }

    public synchronized void comenzar(){
        this.puedenChambear=true;
        System.out.println("HA PONERLE WENO !!!");
        notifyAll();
    }
}

public class HiloMainNA2 {
    public static void main(String[] args) {
        Chambear chambear = new Chambear();

        Runnable chambeador = () -> {
            String nombre = Thread.currentThread().getName();

            try {
                chambear.esperar(nombre);
                Thread.sleep((long) (Math.random()*2000));
            } catch (InterruptedException e) {
                System.out.println("Error: " +e);
            }
        };

        Thread ch1 = new Thread(chambeador,"Mpape");
        Thread ch2 = new Thread(chambeador,"Bini");
        Thread ch3 = new Thread(chambeador,"Meshi");
        Thread ch4 = new Thread(chambeador,"Rony");

        ch1.start();
        ch2.start();
        ch3.start();
        ch4.start();

        try{
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            System.out.println("Error: " +e);
        }

        chambear.comenzar();
    }
}
