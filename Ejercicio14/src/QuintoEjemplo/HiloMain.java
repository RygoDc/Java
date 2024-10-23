package QuintoEjemplo;

import java.util.LinkedList;

public class HiloMain {
    public static void main(String[] args) {
        Almacen almacen = new Almacen();
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(100);
        lista.add(200);
        lista.add(300);
        lista.add(400);
        lista.add(500);
        lista.add(600);
        lista.add(700);
        lista.add(800);
        lista.add(900);

        almacen.setElementosLista(lista);

        Thread productor = new Thread(() -> {
           try{
               int valor = 1;
//               boolean salir = false;
               while (true){
                   almacen.producir(valor);
                   valor++;
                   Thread.sleep(1000);
//                   if(valor == 20){
//                       salir = true;
//                   }
               }
           }
           catch (InterruptedException e){
               System.out.println("Error: "+e);
           }
        });

        Thread consumidor = new Thread(() ->{
            try{
                int valor = 1;
//                boolean salir = false;
                while (true){
                    almacen.consumir();
                    valor++;
                    Thread.sleep(1000);
//                    if(valor == 20){
//                        salir = true;
//                    }
                }
            }
            catch (InterruptedException e){
                System.out.println("Error: "+e);
            }
        });
        productor.start();
        consumidor.start();
    }
}
