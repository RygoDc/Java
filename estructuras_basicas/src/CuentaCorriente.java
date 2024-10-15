//public class CuentaCorriente extends CuentaBancaria{
//    public int envios;
//
//    public CuentaCorriente(double saldo, int envios, int maxEnvios) {
//        super(saldo);
//        this.envios = 5;
//    }
//
//    @Override
//    public void depositar(double cantidad) {
//        this.saldo += cantidad;
//        System.out.println("Se ha depositado: " +cantidad +" el saldo nuevo es: "+ this.saldo);
//    }
//
//    @Override
//    public void retirar(double cantidad) {
//        if(this.saldo >= cantidad && this.envios >0){
//            this.saldo -=cantidad;
//            this.envios--;
//            System.out.println("Se ha retirado: " +cantidad +" el saldo nuevo es: "+ this.saldo);
//        }
//        else {
//            System.out.println("Saldo Insuficiente");
//        }
//    }
//
//    @Override
//    public String toString() {
//        return "CuentaCorriente{" +
//                "envios=" + envios +
//                ", saldo=" + saldo +
//                '}';
//    }
//}
