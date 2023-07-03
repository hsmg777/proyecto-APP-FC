public class OrdenArreglo {
    String cedula;
    String prenda;
    String descripcion;
    int numOrden;

    public OrdenArreglo(String cedula, String prenda, String descripcion, int numOrden) {
        this.cedula = cedula;
        this.prenda = prenda;
        this.descripcion = descripcion;
        this.numOrden = numOrden;
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
}
