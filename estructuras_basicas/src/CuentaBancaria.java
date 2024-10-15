abstract class CuentaBancaria {
    protected double saldo;

    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public abstract void depositar();
    public abstract void retirar();

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "saldo=" + saldo +
                '}';
    }
}
