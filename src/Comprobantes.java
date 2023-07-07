public class Comprobantes {
    private String nombre;
    private int Ncuenta;
    private String comprobante;
    private String fecha;
    private String banco;
    private float monto;

    public Comprobantes(String nombre, int ncuenta, String comprobante, String fecha, String banco, float monto) {
        this.nombre = nombre;
        Ncuenta = ncuenta;
        this.comprobante = comprobante;
        this.fecha = fecha;
        this.banco = banco;
        this.monto = monto;
    }


    @Override
    public String toString() {
        return "Comprobantes" +
                "Nombre:" + nombre +
                "Numero de cuenta:" + Ncuenta +
                "Numero de comprobante: " + comprobante +
                "Fecha: " + fecha +
                "Banco origen: " + banco +
                "Monto: " + monto ;


    }
}
