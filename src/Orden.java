import java.util.LinkedList;

public class Orden {
    String cedula;
    String lista;
    int aux;

    public Orden(String cedula, String lista, int aux) {
        this.cedula = cedula;
        this.lista = lista;
        this.aux = aux;
    }

    public String getCedula() {
        return cedula;
    }

    public int getAux() {
        return aux;
    }

    @Override
    public String toString() {
        return "\nOrden:" + aux +
                "\nCedula:\t" + cedula +
                "\n" + lista;
    }
}
