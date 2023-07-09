public class OrdenArreglo {
    String cedula;
    String prenda;
    String descripcion;
    int numOrden;
    String status;

    public OrdenArreglo(String cedula, String prenda, String descripcion, int numOrden, String status) {
        this.cedula = cedula;
        this.prenda = prenda;
        this.descripcion = descripcion;
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
        return "\nOrden: " + numOrden +
                "\nCedula:\t" + cedula +
                "\nPrenda:\t" + prenda +
                "\nDescripcion:\t" + descripcion;
    }
    public String toStringStatus() {
        return "\nOrden:" + numOrden +
                "\nCedula: " + cedula +
                "\nStatus: " + status;
    }
}
