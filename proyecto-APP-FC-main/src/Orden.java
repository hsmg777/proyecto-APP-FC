import java.util.LinkedList;

public class Orden {
    String cedula;
    String lista;
    int aux;
    String status;

    public Orden(String cedula, String lista, int aux, String status) {
        this.cedula = cedula;
        this.lista = lista;
        this.aux = aux;
        this.status = status;
    }

    public String getCedula() {
        return cedula;
    }

    public int getAux() {
        return aux;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "\nOrden:" + aux +
                "\nCedula: " + cedula +
                "\n" + lista;
    }


    public String toStringStatus() {
        return "\nOrden:" + aux +
                "\nCedula: " + cedula +
                "\nStatus: " + status;
    }
}
