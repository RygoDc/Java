package Ejercicio7;

public class Barrera {
    private boolean continuarJuntos = false;

    public synchronized void esperarInicio(String hilo) throws InterruptedException{
        while (!this.continuarJuntos){
            System.out.println(hilo+ " esta esperando para continuar juntos");
            wait();
        }
        System.out.println(hilo+ " ha comenzado a avanzar");
    }
    public synchronized void iniciarJuntos(){
        this.continuarJuntos=true;
        System.out.println("los hilos han llegado a la barrera, ya pueden continuar juntos");
        notifyAll();
    }
}
