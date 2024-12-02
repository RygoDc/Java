package NOTIFY.Ascensor;

class Ascensor{
    private int capacidad =3;
    private int espacio;

    public synchronized void subir(String persona) throws InterruptedException{
        while (this.capacidad == this.espacio){
            System.out.println("Ascensor lleno");
            System.out.println(persona+" esperando a subir");
            wait();
        }
        System.out.println(persona+" subió al ascensor, hay "+(this.espacio +1)+" dentro");
        this.espacio++;
        notify();
    }

    public synchronized void bajar(String persona) throws InterruptedException{
        this.espacio--;
        System.out.println(persona+" bajó del ascensor, hay "+this.espacio+" dentro");
        notify();
    }

}

public class HiloMain3 {
    public static void main(String[] args) {
        Ascensor ascensor = new Ascensor();

        Thread persona1 = new Thread(() -> {
            try {
                ascensor.subir("persona 1");
                Thread.sleep(1000);
                ascensor.bajar("persona 1");
            } catch (InterruptedException e) {
                System.out.println("Error: " +e);
            }
        });

        Thread persona2 = new Thread(() -> {
            try {
                ascensor.subir("persona 2");
                Thread.sleep(1000);
                ascensor.bajar("persona 2");
            } catch (InterruptedException e) {
                System.out.println("Error: " +e);
            }
        });

        Thread persona3 = new Thread(() -> {
            try {
                ascensor.subir("persona 3");
                Thread.sleep(1000);
                ascensor.bajar("persona 3");
            } catch (InterruptedException e) {
                System.out.println("Error: " +e);
            }
        });

        Thread persona4 = new Thread(() -> {
            try {
                ascensor.subir("persona 4");
                Thread.sleep(1000);
                ascensor.bajar("persona 4");
            } catch (InterruptedException e) {
                System.out.println("Error: " +e);
            }
        });

        Thread persona5 = new Thread(() -> {
            try {
                ascensor.subir("persona 5");
                Thread.sleep(1000);
                ascensor.bajar("persona 5");
            } catch (InterruptedException e) {
                System.out.println("Error: " +e);
            }
        });

        persona1.start();
        persona2.start();
        persona3.start();
        persona4.start();
        persona5.start();

    }
}
