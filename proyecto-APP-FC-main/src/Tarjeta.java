public class Tarjeta {
    private String numTarjet;
    private String fecha;
    private String cvv;

    public Tarjeta(String numTarjet, String fecha, String cvv) {
        this.numTarjet = numTarjet;
        this.fecha = fecha;
        this.cvv = cvv;
    }

    public String getNumTarjet() {
        return numTarjet;
    }

    public void setNumTarjet(String numTarjet) {
        this.numTarjet = numTarjet;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    @Override
    public String toString() {
        return "\nTarjeta: " +
                "\nNumero: " + numTarjet +
                "\nFecha: " + fecha;
    }

}
