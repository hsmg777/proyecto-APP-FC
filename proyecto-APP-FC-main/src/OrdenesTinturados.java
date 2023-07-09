import java.util.LinkedList;

public class OrdenesTinturados {
    LinkedList<OrdenTint> ordenTTNT = new LinkedList<>();

    public void add (OrdenTint o){
        ordenTTNT.add(o);
    }
    public void delete (OrdenTint o){
        ordenTTNT.remove(o);
    }
    public OrdenTint buscarOrden(String cedula, int aux) {
        for (OrdenTint o : ordenTTNT) {
            if (o.getCedula().equalsIgnoreCase(cedula) && o.getNumOrden()==aux) {
                return o;
            }
        }
        return null; // Si no se encuentra ningún usuario con la cédula buscada
    }
    public int tamano(){
        return ordenTTNT.size();
    }

    public LinkedList ordenesPedidos () {
        LinkedList<Integer> listaOrdenes = new LinkedList<>();
        for (OrdenTint b : ordenTTNT){
            listaOrdenes.add(b.getNumOrden());
        }
        return listaOrdenes;
    }
    public LinkedList cedulasPedidos (){
        LinkedList<String> listaCedulas = new LinkedList<>();
        for (OrdenTint x : ordenTTNT) {
            listaCedulas.add(x.getCedula());
        }
        return listaCedulas;
    }
}
