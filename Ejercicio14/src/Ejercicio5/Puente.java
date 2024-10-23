package Ejercicio5;

public class Puente {
    private boolean cruzaNorte = false;
    private boolean cruzaSur = false;

    public void cruzarNorte(int coche) throws InterruptedException{
        synchronized (this){
            while(cruzaSur){
                System.out.println("Coche del norte: "+coche+ " esperando, coche del sur está cruzando ");
                wait();
            }
            cruzaNorte=true;
            System.out.println("Coche del norte: "+coche+" esta cruzando el puente");
            Thread.sleep(1000);
            cruzaNorte=false;
            System.out.println("Coche del norte: "+coche+ " ha cruzado el puente");
            notify();
        }
    }
    public void cruzarSur(int coche) throws InterruptedException{
        synchronized (this){
            while(cruzaNorte){
                System.out.println("Coche del sur: "+coche+ " esperando, coche del norte está cruzando ");
                wait();
            }
            cruzaSur=true;
            System.out.println("Coche del sur: "+coche+" esta cruzando el puente");
            Thread.sleep(1000);
            cruzaSur=false;
            System.out.println("Coche del sur: "+coche+ " ha cruzado el puente");
            notify();
        }
    }
}
