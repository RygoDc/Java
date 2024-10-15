public class Programador extends Empleado implements Autenticable,Bonificable{
    public Programador(String nombre, int salarioBase, int bono) {
        super(nombre, salarioBase, bono);
    }

    @Override
    void calcularSalario() {
        System.out.println("El salario es de: " +this.salarioBase);
    }

    @Override
    void mostrarInformacion() {
        System.out.println("Datos del Programador:");
        System.out.println("Nombre: "+this.nombre +"\n Salario: "+this.salarioBase +"\n Bono: "+this.bono +" ");
    }

    @Override
    public void iniciarSesion(String usuario, String clave) {
        if (usuario == "carlosP" && clave =="password456") {
            System.out.println("Has Iniciado Sesion como Programador");
        }
        else
            System.out.println("Usuario no valido");
    }

    @Override
    public void cerrarSesion() {
        System.out.println("Has cerrado Sesión");
    }

    @Override
    public void calcularBono() {
        int resultado = this.salarioBase + this.bono;
        System.out.println("El Salario + el bono es: " + resultado);
    }

}

