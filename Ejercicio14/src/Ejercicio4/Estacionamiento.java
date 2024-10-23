package Ejercicio4;

import java.util.LinkedList;

public class Estacionamiento {
    private LinkedList<Integer> lista = new LinkedList<>();
    private final int capacidad = 5;

    public void setLista(LinkedList<Integer> lista) {
        this.lista = lista;
    }

    public void entrada(int coche) throws InterruptedException{
        synchronized (this){
            while (lista.size() >= capacidad){
                wait();
            }
            this.lista.add(coche);
            System.out.println("Entra el coche: " );
        }
    }

}
