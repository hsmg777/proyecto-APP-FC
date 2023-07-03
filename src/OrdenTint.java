public class OrdenTint {
    String cedula;
    String prenda;
    String color;
    int numOrden;

    public OrdenTint(String cedula, String prenda, String color, int numOrden) {
        this.cedula = cedula;
        this.prenda = prenda;
        this.color = color;
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
        return "\nOrden:" + numOrden +
                "\nCedula:\t" + cedula +
                "\nPrenda:\t" + prenda +
                "\nA COLOR:\t" + color ;
    }
}
