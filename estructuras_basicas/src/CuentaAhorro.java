public class CuentaAhorro extends CuentaBancaria{
    public double interesAnual;

    public CuentaAhorro(double saldo, double interesAnual) {
        super(saldo);
        this.interesAnual = interesAnual;
    }

    public void calcularInteres(){
        this.saldo +=interesAnual;
        System.out.println("Interes anual aplicado: "+interesAnual+ " saldo actual: "+this.saldo);
    }


    @Override
    public void depositar() {

    }

    @Override
    public void retirar() {

    }


}
