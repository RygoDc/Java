public class Gato extends Animal{
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }
    @Override
    public void hacerSonido(){
        System.out.println(this.nombre + " dice: Miau miau re miau");
    }

    public void moverCola(){
        System.out.println(this.nombre + " esta ronroneando");
    }

}
