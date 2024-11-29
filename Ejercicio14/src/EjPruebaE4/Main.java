package EjPruebaE4;

import java.sql.SQLOutput;

class Estacionamiento{
    private int capacidad = 3;
    private int vehiculosDentro;


    public synchronized void entrar(String coche) throws InterruptedException {
            while (vehiculosDentro == capacidad) {
                System.out.println("Vehículo " + coche + " esperando, estacionamiento lleno.");
                wait();
            }
            this.vehiculosDentro++;
            System.out.println("Vehículo " + coche + " ha entrado. Vehículos dentro: " + vehiculosDentro);
            notify();
        }


public synchronized void salir(String coche) throws InterruptedException {
             vehiculosDentro--;
                System.out.println("Vehículo " + coche + " ha salido. Vehículos dentro: " + vehiculosDentro);
                notify();
            }

    public synchronized void cerrarEstacionamiento() throws InterruptedException{
        System.out.println("aparcamiento cerrado");
        notifyAll();
    }


public class Main {

    Estacionamiento estacionamiento = new Estacionamiento;


}
