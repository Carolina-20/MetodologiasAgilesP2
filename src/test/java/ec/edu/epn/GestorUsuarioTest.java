package ec.edu.epn;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GestorUsuarioTest {

    GestorUsuario gu = null;
    Usuario u = null;

    @Before
    public void setUp(){
        gu = new GestorUsuario();
        u = new Usuario("1752969251","Alex", "Vicarra", "0932534134",
                " Perez G Oe1", "aviscarr@outlook.com", false);
        gu.registrarUsuario(u);
        System.out.println("setUp");
    }

    @Test
    public void given_attributes_when_modify_nombre_then_ok(){
        String expectedName = "Pedro";
        gu.modificarNombreUsuario("1752969251", expectedName);
        assertEquals(expectedName, u.getNombre());
        System.out.println("Test1");
    }

    @Test
    public void given_attributes_when_modify_lastname_then_ok(){
        String expectedLastName = "Alvarez";
        gu.modificarApellidoUsuario("1752969251", expectedLastName);
        assertEquals(expectedLastName, u.getApellido());
        System.out.println("Test2");
    }

    @Test
    public void given_attributes_when_modify_mail_then_ok(){
        String expectedMail = "aviscarr@outlook.com";
        gu.modificarCorreoUsuario("1752969251", expectedMail);
        assertEquals(expectedMail, u.getCorreo());
        System.out.println("Test3");
    }
    @Test
    public void given_attributes_when_modify_telefono_then_ok(){
        String expectedTelefono = "0932534134";
        gu.modificarTelefonoUsuario("1752969251", expectedTelefono);
        assertEquals(expectedTelefono, u.getCorreo());
        System.out.println("Test4");
    }

}