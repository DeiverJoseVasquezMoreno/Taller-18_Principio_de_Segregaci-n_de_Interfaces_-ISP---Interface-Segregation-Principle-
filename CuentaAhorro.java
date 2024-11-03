public class CuentaAhorro implements Transferencia, Retiro {
    @Override
    public void transferir(double monto) {
        System.out.println("Transfiriendo: " + monto);
    }

    @Override
    public void retirar(double monto) {
        System.out.println("Retirando: " + monto);
    }
}
