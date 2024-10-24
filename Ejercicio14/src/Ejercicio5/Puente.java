package Ejercicio5;

public class Puente {
//    private boolean cruzaNorte = false;
//    private boolean cruzaSur = false;
    private boolean vehiculoEnPuente =false;

    public void cruzarNorte(int coche) throws InterruptedException{
        synchronized (this){
            while(this.vehiculoEnPuente){
                System.out.println("Coche del norte "+coche+ " esperando, coche del sur está cruzando ");
                wait();
            }
            this.vehiculoEnPuente=true;
            System.out.println("Coche del norte "+coche+" esta cruzando el puente");
            Thread.sleep(1000);
            this.vehiculoEnPuente=false;
            System.out.println("Coche del norte "+coche+ " ha cruzado el puente");
            notify();
        }
    }
    public void cruzarSur(int coche) throws InterruptedException{
        synchronized (this){
            while(this.vehiculoEnPuente){
                System.out.println("Coche del sur "+coche+ " esperando, coche del norte está cruzando ");
                wait();
            }
            this.vehiculoEnPuente=true;
            System.out.println("Coche del sur "+coche+" esta cruzando el puente");
            Thread.sleep(1000);
            this.vehiculoEnPuente=false;
            System.out.println("Coche del sur "+coche+ " ha cruzado el puente");
            notify();
        }
    }
}
