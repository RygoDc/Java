package Ejercicio8;

public class Fabrica {
    private boolean llegaMaterial = false;

    public synchronized void esperarInicio(String trabajador) throws InterruptedException{
        while (!this.llegaMaterial){
            System.out.println(trabajador+ " esta esperando a que llegue el material");
            wait();
        }
        System.out.println(trabajador+ " ha comenzado a trabajar");
    }
    public synchronized void iniciarTrabajo(){
        this.llegaMaterial=true;
        System.out.println("Ha llegado el material, ya pueden trabajar");
        notifyAll();
    }
}


