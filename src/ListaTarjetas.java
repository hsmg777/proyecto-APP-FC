import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListaTarjetas {
    LinkedList<Tarjeta> listita = new LinkedList<Tarjeta>();

    public void agregar(Tarjeta t ){
        if (!listita.contains(t)){
            listita.add(t);
            JOptionPane.showMessageDialog(null, "Su tarjeta se ha añadido con exito");
        } else {
            JOptionPane.showMessageDialog(null,"Su tarjeta ya ha sido registrada" );
        }


    }

        public boolean validateCreditCard(String cardNumber) {
            // Eliminar espacios en blanco y guiones del número de tarjeta
            String cleanNumber = cardNumber.replaceAll("[ -]", "");

            // Comprobar si el número de tarjeta contiene solo dígitos
            if (!cleanNumber.matches("\\d+")) {
                return false;
            }

            // Aplicar el algoritmo de Luhn
            int sum = 0;
            boolean alternate = false;
            for (int i = cleanNumber.length() - 1; i >= 0; i--) {
                int digit = Integer.parseInt(cleanNumber.substring(i, i + 1));
                if (alternate) {
                    digit *= 2;
                    if (digit > 9) {
                        digit = (digit % 10) + 1;
                    }
                }
                sum += digit;
                alternate = !alternate;
            }

            // Verificar si la suma es divisible por 10
            return sum % 10 == 0;
        }

    public boolean validarFecha(String fecha) {
        try {
            // Obtener la fecha actual
            LocalDate fechaActual = LocalDate.now();

            // Definir el formato de fecha para tarjetas de crédito en Ecuador
            DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            // Convertir la fecha proporcionada a LocalDate
            LocalDate fechaIngresada = LocalDate.parse(fecha, formatoFecha);

            // Verificar si la fecha ingresada es posterior o igual a la fecha actual
            if (fechaIngresada.isAfter(fechaActual) || fechaIngresada.isEqual(fechaActual)) {
                return true; // La fecha es válida
            } else {
                return false; // La fecha es anterior a la fecha actual, no es válida
            }
        } catch (Exception e) {
            return false; // Error al analizar la fecha, no es válida
        }
    }

    @Override
    public String toString() {
        return "Tarjetas registradas:\n" + listita ;
    }
}
