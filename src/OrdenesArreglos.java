import java.util.LinkedList;

public class OrdenesArreglos {
    LinkedList<OrdenArreglo> ordenArreg = new LinkedList<>();

    public void add (OrdenArreglo o){
        ordenArreg.add(o);
    }
    public void delete (OrdenArreglo o){
        ordenArreg.remove(o);
    }
    public OrdenArreglo buscarOrden(String cedula, int aux) {
        for ( OrdenArreglo o : ordenArreg) {
            if (o.getCedula().equalsIgnoreCase(cedula) && o.getNumOrden()==aux) {
                return o;
            }
        }
        return null; // Si no se encuentra ningún usuario con la cédula buscada
    }
    public int tamano(){
        return ordenArreg.size();
    }

    public LinkedList ordenesPedidos () {
        LinkedList<Integer> listaOrdenes = new LinkedList<>();
        for (OrdenArreglo b : ordenArreg){
            listaOrdenes.add(b.getNumOrden());
        }
        return listaOrdenes;
    }
    public LinkedList cedulasPedidos (){
        LinkedList<String> listaCedulas = new LinkedList<>();
        for (OrdenArreglo x : ordenArreg) {
            listaCedulas.add(x.getCedula());
        }
        return listaCedulas;
    }

    @Override
    public String toString() {
        return "Ordenes:" + ordenArreg ;
    }
}

