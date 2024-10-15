public class TelefonoInteligente extends Dispositivos implements Conectable{
    public String marca;

    public TelefonoInteligente(String marca){
        this.marca = marca;
    }

    public TelefonoInteligente(){
    }

    @Override
    public void encender() {
        estado = "Encendido";
        System.out.println("El telefono esta " +estado);
    }

    @Override
    public void conectarWifi() {
        System.out.println("Telefono conectado a Wifi");
    }

    @Override
    public void desconectarWifi() {
        System.out.println("Telefono desconectado del wifi");
    }

    @Override
    public String toString() {
        return "TelefonoInteligente{" +
                "marca='" + marca + '\'' +
                '}';
    }
}
