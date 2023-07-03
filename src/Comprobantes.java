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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNcuenta() {
        return Ncuenta;
    }

    public void setNcuenta(int ncuenta) {
        Ncuenta = ncuenta;
    }

    public String getComprobante() {
        return comprobante;
    }

    public void setComprobante(String comprobante) {
        this.comprobante = comprobante;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
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
