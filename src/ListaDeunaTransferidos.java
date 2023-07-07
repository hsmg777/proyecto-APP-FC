import java.util.LinkedList;

public class ListaDeunaTransferidos {
    LinkedList<ComprobanteDeUna> alrila = new LinkedList<>();

    public void agregar (ComprobanteDeUna deU){
        alrila.add(deU);
    }
    public void remove (ComprobanteDeUna deU) {
        alrila.remove(deU);
    }

    @Override
    public String toString() {
        return "Lista a verificar:" + alrila;
    }
}
