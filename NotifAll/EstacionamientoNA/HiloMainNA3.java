package NotifAll.EstacionamientoNA;

class Estacionamiento{
    private int capacidad = 3;
    private int ocupados;

    public synchronized void entrar(String nombre) throws InterruptedException{
        while (this.capacidad == this.ocupados){
            System.out.println("Estacionamiento lleno!!!");
            System.out.println(nombre+" esta esperando para aparcar");
            wait();
        }
        System.out.println(nombre + " ha aparcado, hay "+(this.ocupados+1)+" espacios ocupados");
        this.ocupados++;
        notify();
    }

    public synchronized void salir(String nombre) throws InterruptedException{
        this.ocupados--;
        System.out.println(nombre+ " ha salido, hay "+this.ocupados+" espacios ocupados");
        notify();
    }

    public synchronized void cierraEstacionamiento(){
        System.out.println("SE CIERRA EL ESTACIONAMIENTO");
        notifyAll();
    }

}

public class HiloMainNA3 {
    public static void main(String[] args) {
        Estacionamiento estacionamiento = new Estacionamiento();

        Runnable vehiculo = () ->{
            String nombre = Thread.currentThread().getName();

            try {
                estacionamiento.entrar(nombre);
                Thread.sleep(2000);
                estacionamiento.salir(nombre);
            } catch (InterruptedException e) {
                System.out.println("Error: "+e);
            }
        };

        Thread v1 = new Thread(vehiculo,"shumi");
        Thread v2 = new Thread(vehiculo,"bertapen");
        Thread v3 = new Thread(vehiculo,"senna");
        Thread v4 = new Thread(vehiculo,"alfonso");
        Thread v5 = new Thread(vehiculo,"tiroloco");

        v1.start();
        v2.start();
        v3.start();
        v4.start();
        v5.start();

        try{
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            System.out.println("Error: "+e);
        }
        estacionamiento.cierraEstacionamiento();
    }
}
