public class CuentaCorriente implements Retiro, PagoFactura {
    @Override
    public void retirar(double monto) {
        System.out.println("Retirando: " + monto);
    }

    @Override
    public void pagarFactura(double monto) {
        System.out.println("Pagando factura: " + monto);
    }
}
