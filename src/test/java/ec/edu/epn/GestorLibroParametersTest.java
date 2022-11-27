package ec.edu.epn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(value = Parameterized.class)
public class GestorLibroParametersTest {
    private Libro libro;
    private String idLibro, nuevoTitulo;

    @Parameterized.Parameters
    public static Iterable<Object[]> parameters(){
        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{new Libro("1475","1980",
                "ISBN 0-2376-2212","G Orwell",250),"1475","1984"});
        objects.add(new Object[]{new Libro("2478","Don Quijote",
                "ISBN 0-3434-2344","M. de Cervantes",500),"2478","Don Quijote de la mancha"});
        objects.add(new Object[]{new Libro("7033","Cronica ",
                "ISBN 0-4347-2138","G. Marquez", 200),"7033","Cronica de una muerte anunciada"});
        return objects;
    }

    public GestorLibroParametersTest(Libro libro, String idLibro, String nuevoTitulo){
        this.libro = libro;
        this.idLibro = idLibro;
        this.nuevoTitulo = nuevoTitulo;
    }
    @Test
    public void given_attributes_when_modify_title_then_ok(){
        GestorLibro gl = new GestorLibro();
        gl.agregarLibro(libro);
        gl.modificarTituloLibro(idLibro, nuevoTitulo);
        String expectedTitle = nuevoTitulo;
        assertEquals(expectedTitle, libro.getTitulo());
    }
}