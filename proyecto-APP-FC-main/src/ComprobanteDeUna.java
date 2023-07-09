public class ComprobanteDeUna {
    public String nombre;
    public String monto;
    public String fecha;

    public ComprobanteDeUna(String nombre, String monto, String fecha) {
        this.nombre = nombre;
        this.monto = monto;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "\nComprobante DE UNA:\n" +
                "Nombre:\t" + nombre +
                "\nMonto:\t" + monto +
                "\nFecha:\t" + fecha;
    }
}
