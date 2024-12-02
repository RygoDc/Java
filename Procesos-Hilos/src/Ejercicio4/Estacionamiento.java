package Ejercicio4;

public class Estacionamiento {
    private int capacidad;
    private int vehiculosDentro;

    public Estacionamiento(int capacidad) {
        this.capacidad = capacidad;
        this.vehiculosDentro = 0;
    }

    public void entrar(int coche) throws InterruptedException{
        synchronized (this){
            while (vehiculosDentro >= capacidad) {
                System.out.println("Vehículo " + coche + " esperando, estacionamiento lleno.");
                wait();
            }
            vehiculosDentro++;
            System.out.println("Vehículo " + coche + " ha entrado. Vehículos dentro: " + vehiculosDentro);
            notify();
        }
    }

    public void salir(int coche) {
        synchronized (this){
            vehiculosDentro--;
            System.out.println("Vehículo " + coche + " ha salido. Vehículos dentro: " + vehiculosDentro);
            notify();
        }
    }

}
