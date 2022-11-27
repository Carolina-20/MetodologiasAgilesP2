package ec.edu.epn;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GestorLibroTest {

    GestorLibro gl = null;
    Libro l = null;

    @Before
    public void setUp(){
        gl = new GestorLibro();
        l = new Libro("2314", "La chica tren",
                "ISBN 0-7645-2641-3", " Paula Hawkins", 496);
        gl.agregarLibro(l);
        System.out.println("setUp");
    }


    @Test
    public void given_attributes_when_modify_title_then_ok(){
        String expectedTile = "La chica del tren";
        gl.modificarTituloLibro("2314", expectedTile);
        assertEquals(expectedTile, l.getTitulo());
        System.out.println("Test1");
    }
    @Test
    public void given_attributes_when_modify_author_then_ok(){
        String expectedAuthor = "Gabriel Garcia Marquez";
        gl.modificarAutorLibro("2314", expectedAuthor);
        assertEquals(expectedAuthor, l.getAutor());
        System.out.println("Test2");
    }

    @Test
    public void given_attributes_when_modify_ISBN_then_ok(){
        String expectedISBN = "Gabriel Garcia Marquez";
        gl.modificarISBNLibro("2314", expectedISBN);
        assertEquals(expectedISBN, l.getISBN());
        System.out.println("Test3");
    }

    @Test
    public void given_attributes_when_modify_num_pages_then_ok(){
        int expectedNumPages = 567;
        gl.modificarNumPaginasLibro("2314", expectedNumPages);
        assertEquals(expectedNumPages, l.getPaginas());
        System.out.println("Test 4");
    }


}