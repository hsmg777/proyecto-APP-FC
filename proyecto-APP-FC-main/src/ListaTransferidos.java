import java.util.LinkedList;

public class ListaTransferidos {
    LinkedList<Comprobantes> coqui = new LinkedList<>();

    public void agregar (Comprobantes c){
        coqui.add(c);
    }
    public void remove (Comprobantes c) {
        coqui.remove(c);
    }

    @Override
    public String toString() {
        return "Lista a verificar:" + coqui;
    }
}
