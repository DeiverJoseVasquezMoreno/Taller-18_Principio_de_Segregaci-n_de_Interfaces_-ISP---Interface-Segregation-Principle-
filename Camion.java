public class Camion implements Conducible, Carga {
    @Override
    public void conducir() {
        System.out.println("El camión está en movimiento.");
    }

    @Override
    public void cargarMercancia() {
        System.out.println("El camión está cargando mercancía.");
    }
}
