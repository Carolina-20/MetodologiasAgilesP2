package ec.edu.epn;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Joffre
 */
public class GestorLibro {

    ArrayList<Libro> libros = new ArrayList<>();
    Scanner in = new Scanner(System.in);


    public void agregarLibro(Libro libro) {
        libros.add(libro);
        asignarIdEjemplar(libro);
        System.out.println("Libro agregado correctamente");
    }

    //EXTRACT METHOD
    public void asignarIdEjemplar(Libro libro){
        int numEjemplar = 0;
        for (int i = 0; i < libro.getStock(); i++) {
            libro.ejemplares.add(new Ejemplar(numEjemplar, libro.getIdLibro(), "Bueno"));
            numEjemplar++;
        }
    }



    public void eliminarLibro(String idLibro) {
        if (!existenLibros()) {
            Libro libro = buscarLibro(idLibro);
            if(libro != null){
                libros.remove(libro);
                System.out.println("Libro eliminado exitosamente");
            }else{
                System.out.println("El libro no se encuentra registrado");
            }
        } else {
            System.out.println("\nNo existen libros registrados\n");
        }
    }
    
    //EXTRACT METHOD
    public boolean existenLibros(){
        return libros.isEmpty();
    }

    public Libro buscarLibro(String idLibro) {
        for (Libro libro : libros) {
            if (libro.getIdLibro().equals(idLibro)) {
                return libro;
            } else {
                return null;
            }
        }
        return null;
    }

    public void modificarTituloLibro(String idLibro, String titulo) {
        Libro l = buscarLibro(idLibro);
        l.setTitulo(titulo);
    }

    public void modificarAutorLibro(String idLibro, String autor) {
        Libro l = buscarLibro(idLibro);
        l.setAutor(autor);
    }

    public void modificarISBNLibro(String idLibro, String ISBN) {
        Libro l = buscarLibro(idLibro);
        l.setISBN(ISBN);
    }

    public void modificarNumPaginasLibro(String idLibro, int paginas) {
        Libro l = buscarLibro(idLibro);
        l.setPaginas(paginas);
    }

}
