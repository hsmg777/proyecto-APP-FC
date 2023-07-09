public class Producto {
    private String producto;
    private int cantidad;
    private double pUnitario;
    private double pTotal;

    public Producto(String producto, int cantidad, double pUnitario, double pTotal) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.pUnitario = pUnitario;
        this.pTotal = pTotal;
    }

    public String getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getpUnitario() {
        return pUnitario;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setpUnitario(double pUnitario) {
        this.pUnitario = pUnitario;
    }

    public void setpTotal(double pTotal) {
        this.pTotal = pTotal;
    }

    public double getpTotal() {
        return pTotal;
    }

    @Override
    public String toString() {
                return "\nProducto: \t" + "Cantidad: \t" + "Valor: \t" + "Total: \n" +
                 producto + "\t" + cantidad + "\t" + pUnitario + "\t" + pTotal;

    }
}
