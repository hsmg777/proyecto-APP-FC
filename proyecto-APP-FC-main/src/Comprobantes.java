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
        return "\nComprobante:\n" +
                "Nombre:\t" + nombre +
                "\nNumero de cuenta:\t" + Ncuenta +
                "\nNumero de comprobante: \t" + comprobante +
                "\nFecha: \t" + fecha +
                "\nBanco origen: \t" + banco +
                "\nMonto: \t" + monto ;


    }
}
