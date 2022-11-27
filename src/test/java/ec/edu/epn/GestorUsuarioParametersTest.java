package ec.edu.epn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import static org.junit.Assert.*;
@RunWith(value = Parameterized.class)
public class GestorUsuarioParametersTest {
    private Usuario usuario;
    private String cedula, nuevoNombre;
    @Parameterized.Parameters
    public static Iterable<Object[]> parameters(){
        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{new Usuario("1752969251","Alex","Viscarra",
                "0932534134"," Perez G Oe1", "aviscarr@outlook.com", false),"1752969251","Pedro"});
        objects.add(new Object[]{new Usuario("1726085564","Javier","Lopez",
                "0968081760"," America Oe3", "javierl@outlook.com", false),"1726085564","Marco"});
        objects.add(new Object[]{new Usuario("1707007033","Anita","Perez",
                "0970381122"," Cangahua Oe3", "anap02@outlook.com", false),"1707007033","Samantha"});
        return objects;
    }
    public GestorUsuarioParametersTest(Usuario usuario, String cedula, String nuevoNombre){
        this.usuario = usuario;
        this.cedula = cedula;
        this.nuevoNombre = nuevoNombre;
    }
    @Test
    public void given_attributes_when_modify_name_then_ok(){
        GestorUsuario gu = new GestorUsuario();
        gu.registrarUsuario(usuario);
        gu.modificarNombreUsuario(cedula, nuevoNombre);
        String expectedName = nuevoNombre;
        assertEquals(expectedName, usuario.getNombre());
    }

}