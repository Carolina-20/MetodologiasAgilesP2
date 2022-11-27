package ec.edu.epn;

/**
 *
 * @author Juan
 */

public class Persona {
    
    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    private String correo;
    private String atributos[];

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        atributos[1]=nombre;
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        atributos[2]=apellido;
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        atributos[3]=telefono;
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        atributos[4]=direccion;
        this.direccion = direccion;
    }
    public String[] getAtributos() {
        return atributos;
    }
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        atributos[5]=correo;
        this.correo = correo;
    }

    Persona(String cedula, String nombre, String apellido, String telefono, String direccion, String correo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        atributos=new String[6];
        atributos[0]=cedula;
        atributos[1]=nombre;
        atributos[2]=apellido;
        atributos[3]=telefono;
        atributos[4]=direccion;
        atributos[5]=correo;
    }

    @Override
    public String toString() {
        return "Cédula: " + cedula + "\n Nombre: " + nombre + "\nApellido: " + apellido + "\nTelefono: " + telefono + "\nDirección: " + direccion + "\nCorreo: " + correo;
    }
       
}
