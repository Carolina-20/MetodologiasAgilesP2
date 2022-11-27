package ec.edu.epn;

public interface IGestorUsuario {

    public String modificarNombreUsuario(String cedula, String nuevoNombre);

    public String modificarApellidoUsuario(String cedula, String apellidoNombre);
}
