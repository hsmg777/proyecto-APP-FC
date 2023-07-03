import java.util.LinkedList;
import java.util.List;

public class ListaProductosAgg {
    List<Producto> lista = new LinkedList<Producto>();

    public void add(Producto p) {
        lista.add(p);
    }

    public boolean existeProdu(Producto p){
        for (Producto a:lista) {
            if (a.getProducto().equalsIgnoreCase(p.getProducto())){
                lista.remove(a);
                return true;
            }
        }
        return false;
    }
    public void delete(Producto p){
        lista.remove(p);
    }
    private int subtotalRecursi (int cantidad){
        if (cantidad<0){
            return 0;
        } else  {
            return (int) (lista.get(cantidad).getpTotal() + subtotalRecursi(cantidad - 1));
        }

    }

    public int subtotalRecursi  () {
        return subtotalRecursi (lista.size()-1);
    }

    @Override
    public String toString() {
        return "PRODUCTOS AGREGADOS: \n" +
                 lista;
    }
}
