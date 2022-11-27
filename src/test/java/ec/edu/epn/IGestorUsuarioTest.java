package ec.edu.epn;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class IGestorUsuarioTest {

    IGestorUsuario igu = null;

    @Before
    public void setUp(){
        igu = Mockito.mock(IGestorUsuario.class);
        System.out.println("setUp");
    }
    @Test
    public void given_name_when_modify_name_then_ok() {
        Mockito.when(igu.modificarNombreUsuario("1752969251", "Pedro")).thenReturn("Pedro");
        assertEquals("Pedro", igu.modificarNombreUsuario("1752969251", "Pedro"));
        System.out.println("Test1");
    }

    @Test
    public void given_name_when_modify_lastname_then_ok() {
        Mockito.when(igu.modificarApellidoUsuario("1752969251", "Alvarez")).thenReturn("Alvarez");
        assertEquals("Alvarez", igu.modificarApellidoUsuario("1752969251", "Alvarez"));
        System.out.println("Test2");
    }
}