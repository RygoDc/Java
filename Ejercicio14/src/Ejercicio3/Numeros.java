package Ejercicio3;

public class Numeros {
    int numero = 1;

    public void pares() throws InterruptedException{
        synchronized (this){
            while (numero%2 !=0){
                wait();

            }
            System.out.println("Numero Par: " +numero);
            numero++;
            notify();
        }
    }
    public void impares() throws InterruptedException {
        synchronized (this) {
            while (numero % 2 == 0) {
                wait();
            }

            System.out.println("Numero Impar: " + numero);
            numero++;
            notify();
        }
    }
}
