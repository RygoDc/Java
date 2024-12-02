package Ejercicio6;

public class Ascensor {
    private int capacidad;
    private int personasDentro;

    public Ascensor(int capacidad) {
        this.capacidad = capacidad;
        this.personasDentro = 0;
    }

    public void entrar(int persona) throws InterruptedException{
        synchronized (this){
            while (personasDentro >= capacidad) {
                System.out.println("Persona " + persona + " esperando, Ascensor lleno.");
                wait();
            }
            personasDentro++;
            System.out.println("Persona " + persona + " ha entrado. Personas dentro: " + personasDentro);
            notify();
        }
    }

    public void salir(int persona) {
        synchronized (this){
            personasDentro--;
            System.out.println("Persona " + persona + " ha salido. Personas dentro: " + personasDentro);
            notify();
        }
    }
}
