package NOTIFY.NumerosParImpar;

class Numeros{
    private int numero=0;
    public synchronized void pares() throws InterruptedException{
        while (this.numero %2 !=0){
            wait();
        }
        System.out.println(this.numero+" es numero PAR");
        this.numero++;
        notify();
    }
    public synchronized void impar() throws InterruptedException{
        while (this.numero % 2 == 0){
            wait();
        }
        System.out.println(numero+ " es numero IMPAR");
        numero++;
        notify();
    }
}

public class HiloMain4 {
    public static void main(String[] args) {
        Numeros numeros = new Numeros();

        Thread par = new Thread(()->{
            try {
                while(true){
                    numeros.pares();
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println("Error: "+e);
            }
        });

        Thread impar = new Thread(()->{
            try{
                while(true){
                    numeros.impar();
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println("Error: "+e);
            }
        });

        par.start();
        impar.start();
    }
}
