package NotifAll.EstacionamientoNA;

import java.util.LinkedList;

class Aparcamiento{
    private int capacidad=3;
    private LinkedList<String> aparcamiento = new LinkedList<>();

    public synchronized void entrar(String nombre) throws InterruptedException{
        while(this.aparcamiento.size() == this.capacidad){
            System.out.println("APARCAMIENTO LLENO");
            System.out.println(nombre+" esta esperando");
            wait();
        }
        this.aparcamiento.add(nombre);
        System.out.println(nombre+" ha estacionado,");
        notifyAll();
    }
    public synchronized void salir(String nombre) throws InterruptedException{
        this.aparcamiento.remove(nombre);
        System.out.println(nombre+ "ha salido del aparcamiento, lugares ocupados: "+this.aparcamiento.size());
        notify();
    }
    public synchronized void cerrarAparcamiento(){
        System.out.println("SE CIERRA EL APARCAMIENTO");
        notifyAll();
    }

}

public class HiloMainLinkedlist {
    public static void main(String[] args) {
        Aparcamiento aparcamiento = new Aparcamiento();

        Runnable vehiculo = () ->{
            String nombre = Thread.currentThread().getName();
            try {
                aparcamiento.entrar(nombre);
                Thread.sleep((long)(Math.random()*3000));
                aparcamiento.salir(nombre);
            } catch (InterruptedException e) {
                System.out.println("Error: "+e);
            }
        };

        Thread v1 = new Thread(vehiculo,"coche 1");
        Thread v2 = new Thread(vehiculo,"coche 2");
        Thread v3 = new Thread(vehiculo,"coche 3");
        Thread v4 = new Thread(vehiculo,"coche 4");
        Thread v5 = new Thread(vehiculo,"coche 5");

        v1.start();
        v2.start();
        v3.start();
        v4.start();
        v5.start();

        Thread cierre = new Thread(() -> {
            try {
                Thread.sleep(1000);
                aparcamiento.cerrarAparcamiento();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "Cierre Estacionamiento");
        cierre.start();
    }
}
