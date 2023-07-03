public class Usuario {
    private String nombre;
    private String apellido;
    private String cedula;
    private String password;
    private String correo;
    private String celular;


    public Usuario(String nombre, String apellido, String cedula, String password, String correo, String celular) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.password = password;
        this.correo = correo;
        this.celular = celular;
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

    public void setCelular(String celular) {this.celular = celular;}

    @Override
    public String toString() {
        return "Usuario:\n" +
                "Nombre: \t" + nombre + apellido +
                "\nCedula: \n" + cedula  +
                "Correo: \n" + correo +
                "Celular: \n" + celular ;
    }
}
