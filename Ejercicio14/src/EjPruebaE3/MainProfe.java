package EjPruebaE3;

class Coordinador {

    private boolean puedenEmpezar = false;

    public synchronized void esperarInicio(String trabajador) throws InterruptedException {
        while (!this.puedenEmpezar) {
            System.out.println("Trabajador " + trabajador + " esta esperando a que le avisen que puede trabajar");
            wait();
        }
        System.out.println(trabajador + " ha comenzado a trabajar");
    }

    public synchronized void notificarTrabajadores() {
        this.puedenEmpezar = true;
        System.out.println("El jefe ha dado la señal, pueden comenzar a trabajar");
        notifyAll();
    }
}

public class MainProfe {
    public static void main(String[] args) {


    Coordinador coordinador = new Coordinador();

    Runnable trabajador = () ->{
        String nombre = Thread.currentThread().getName();

        try{
            coordinador.esperarInicio(nombre);
        }catch (InterruptedException e){
            System.out.println("Error: "+e);
        }
    };
    Thread trabajador1 = new Thread(trabajador, "pedro");
    Thread trabajador2 = new Thread(trabajador, "pablo");
    Thread trabajador3 = new Thread(trabajador, "diego");

        trabajador1.start();
        trabajador2.start();
        trabajador3.start();

        try{
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        System.out.println("Error: " +e);
    }
        coordinador.notificarTrabajadores();
}
}

