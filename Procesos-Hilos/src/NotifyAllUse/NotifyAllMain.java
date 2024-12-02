package NotifyAllUse;

class Carrera{
    private boolean carreraIniciada = false;

    public synchronized void esperarInicio(String corredor) throws InterruptedException{
        while (!this.carreraIniciada){
            System.out.println("Corredor "+corredor+ " esta esperando el inicio de la carrera");
            wait();
        }
        System.out.println(corredor+ " ha comenzado a correr");
    }
    public synchronized void iniciarCarrera(){
        this.carreraIniciada=true;
        System.out.println("El juez ha dado la señal, La carrera ha comenzado");
        notifyAll();
    }
}
public class NotifyAllMain {
    public static void main(String[] args) {

        Carrera carrera = new Carrera();

        Runnable corredor = () ->{
            String nombre = Thread.currentThread().getName();

            try{
                carrera.esperarInicio(nombre);
            }catch (InterruptedException e){
                System.out.println("Error: "+e);
            }
        };
        Thread corredor1 = new Thread(corredor,"Corredor 1");
        Thread corredor2 = new Thread(corredor,"Corredor 2");
        Thread corredor3 = new Thread(corredor,"Corredor 3");

        corredor1.start();
        corredor2.start();
        corredor3.start();

        try {
            Thread.sleep(3000);
        }
        catch (InterruptedException e){
            System.out.println("Error:" +e);
        }

        carrera.iniciarCarrera();
    }
}
