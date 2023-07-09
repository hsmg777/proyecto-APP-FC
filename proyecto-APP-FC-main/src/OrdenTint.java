public class OrdenTint {
    String cedula;
    String prenda;
    String color;
    int numOrden;
    String status;

    public OrdenTint(String cedula, String prenda, String color, int numOrden, String status) {
        this.cedula = cedula;
        this.prenda = prenda;
        this.color = color;
        this.numOrden = numOrden;
        this.status = status;
    }

    public String getCedula() {
        return cedula;
    }

    public int getNumOrden() {
        return numOrden;
    }

    @Override
    public String toString() {
        return "\nOrden:" + numOrden +
                "\nCedula:\t" + cedula +
                "\nPrenda:\t" + prenda +
                "\nA COLOR:\t" + color ;
    }
    public String toStringStatus() {
        return "\nOrden:" + numOrden +
                "\nCedula: " + cedula +
                "\nStatus: " + status;
    }
}
