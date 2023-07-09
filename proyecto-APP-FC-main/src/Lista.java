import javax.swing.*;
import java.util.*;

public class Lista {
    public Set<Usuario> listadoUsuarios = new HashSet<>();
    public void agregar(Usuario nuevoUsuario) {
        if (verificarCedulaUnica(nuevoUsuario.getCedula())) {
            listadoUsuarios.add(nuevoUsuario);
        } else {
            System.out.println("La cédula ya está en uso.");
        }
    }
    public void eliminar(Usuario nuevoUsuario){
        listadoUsuarios.remove(nuevoUsuario);
    }
    public Set<Usuario> obtenerUsuarios() {
        return new HashSet<>(listadoUsuarios);
    }
    public List<Usuario> ordenarPorApellido() {
        List<Usuario> usuariosOrdenados = new ArrayList<>(listadoUsuarios);
        Collections.sort(usuariosOrdenados, Comparator.comparing(Usuario::getApellido));
        return usuariosOrdenados;
    }
    public boolean verificarCredenciales(String cedula, String password) {
        for (Usuario usuario : listadoUsuarios) {
            if (usuario.getCedula().equals(cedula) && usuario.getPassword().equals(password)) {
                return true;

            }
        }
        return false;
    }
    public boolean verificarCedulaUnica(String cedula) {
        for (Usuario usuario : listadoUsuarios) {
            if (usuario.getCedula().equals(cedula)) {
                return false; // La cédula ya está en uso
            }
        }
        return true; // La cédula es única
    }
    public Usuario buscarPorCedula(String cedula) {
        for (Usuario usuario : listadoUsuarios) {
            if (usuario.getCedula().equals(cedula)) {
                return usuario;
            }
        }
        return null; // Si no se encuentra ningún usuario con la cédula buscada
    }
    public boolean validarCedulaEcuatoriana(String cedula) {
        // Verificar la longitud del número de cédula
        if (cedula.length() != 10) {
            return false;
        }

        try {
            // Obtener los dígitos de la cédula
            int[] digitos = new int[10];
            for (int i = 0; i < 10; i++) {
                digitos[i] = Integer.parseInt(cedula.substring(i, i + 1));
            }

            // Verificar el tercer dígito según el tipo de cédula
            int tercerDigito = digitos[2];
            if (tercerDigito < 0 || tercerDigito > 5) {
                return false;
            }

            // Verificar el décimo dígito usando el algoritmo de verificación
            int verificador = digitos[9];
            int suma = 0;
            for (int i = 0; i < 9; i++) {
                int digito = digitos[i];
                if (i % 2 == 0) {
                    digito *= 2;
                    if (digito > 9) {
                        digito -= 9;
                    }
                }
                suma += digito;
            }

            int residuo = suma % 10;
            int resultado;
            if (residuo == 0) {
                resultado = 0;
            } else {
                resultado = 10 - residuo;
            }

            return resultado == verificador;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    @Override
    public String toString() {
        return listadoUsuarios+"";
    }
}
