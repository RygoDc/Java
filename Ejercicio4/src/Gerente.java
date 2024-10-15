public class Gerente extends Empleado implements Autenticable, Bonificable{
    String usuario;
    String clave;

    public Gerente(String nombre, int salarioBase, int bono) {
        super(nombre, salarioBase, bono);

    }

    @Override
    void calcularSalario() {
        System.out.println("El salario es de: " +this.salarioBase);
    }

    @Override
    void mostrarInformacion() {
        System.out.println("Datos del Gerente:");
        System.out.println("Nombre: "+super.nombre +"\n Salario: "+super.salarioBase +"\n Bono: "+super.bono +" ");
    }

    @Override
    public void iniciarSesion(String usuario, String clave) {
        if (usuario == "lauraG" && clave =="password123") {
            System.out.println("Has Iniciado Sesion como Gerente");
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
