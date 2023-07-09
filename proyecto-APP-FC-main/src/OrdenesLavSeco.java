import java.util.LinkedList;

public class OrdenesLavSeco {
    LinkedList<Orden> ordenes = new LinkedList<Orden>();
    public void add(Orden o){
        ordenes.add(o);
    }
    public void delete(Orden o){
        ordenes.remove(o);
    }
    public Orden buscarOrdenSECO (String cedula, int aux) {
        for (Orden o : ordenes) {
            if (o.getCedula().equalsIgnoreCase(cedula)&&o.getAux()==aux) {
                return o;
            }
        }
        return null; // Si no se encuentra ningún usuario con la cédula buscada
    }
    public int tamano(){
        return ordenes.size();
    }

    public LinkedList ordeneSECO() {
        LinkedList<Integer> listaOrdenes = new LinkedList<>();
        for (Orden b : ordenes){
            listaOrdenes.add(b.getAux());
        }
        return listaOrdenes;
    }

    public LinkedList cedulasSECO (){
        LinkedList<String> listaCedulas = new LinkedList<>();
        for (Orden a : ordenes) {
            listaCedulas.add(a.getCedula());
        }
        return listaCedulas;
    }

    @Override
    public String toString() {
        return "Ordenes al seco:\n " + ordenes ;

    }
}



