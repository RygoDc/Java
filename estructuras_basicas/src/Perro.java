public class Perro extends Animal{
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }
    @Override
    public void hacerSonido(){
        System.out.println(this.nombre+ " dice: Guau Guau re Guau");
    }

    public void moverCola(){
        System.out.println(this.nombre + " esta moviendo la cola");
    }
}
