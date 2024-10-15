public class Tablet extends Dispositivos implements Conectable{


    @Override
    public void encender() {
        estado = "Encendido";
        System.out.println("La Tablet esta " +estado);
    }

    @Override
    public void conectarWifi() {
        System.out.println("Tablet conectado a Wifi");
    }

    @Override
    public void desconectarWifi() {
        System.out.println("Tablet desconectado del wifi");
    }

}
