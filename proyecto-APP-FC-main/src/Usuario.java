public class Usuario {
    private String nombre;
    private String apellido;
    private String cedula;
    private String password;
    private String correo;
    private String celular;
    private String entrega;
    private String recepcion;



    public Usuario(String nombre, String apellido, String cedula, String password, String correo, String celular, String entrega, String recepcion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.password = password;
        this.correo = correo;
        this.celular = celular;
        this.entrega = entrega;
        this.recepcion = recepcion;
    }

    public Usuario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getPassword() {
        return password;
    }


    public void setCorreo(String correo) {this.correo = correo;}

    public String getCorreo() {
        return correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {this.celular = celular;}

    public String getEntrega() {
        return entrega;
    }

    public void setEntrega(String entrega) {
        this.entrega = entrega;
    }

    public String getRecepcion() {
        return recepcion;
    }

    public void setRecepcion(String recepcion) {
        this.recepcion = recepcion;
    }

    @Override
    public String toString() {
        return "Usuario:\n" +
                "Nombre: \t" + nombre + apellido +
                "\nCedula: \t" + cedula  +
                "\nCorreo: \n" + correo +
                "\nCelular: \n" + celular +
                "\nDireccion Entrega:\t" + entrega+
                "\nDireccion Recepcion\t" + recepcion;
    }
}
