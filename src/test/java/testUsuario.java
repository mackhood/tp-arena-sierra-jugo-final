import dominio.Asignaciones.Asignacion;
import dominio.Usuario;
import net.sf.oval.constraint.AssertTrue;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import static junit.framework.TestCase.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class testUsuario {

    private Usuario usuario;
    private String nombreOriginal = "juan";
    private  String gitHubOriginal = "@juan";
    private String nombre = "prueba";
    private String github= "@prueba";
    private List<Asignacion> asignaciones = new ArrayList<>();
    private List<Asignacion> otraAsignaciones = new ArrayList<>();
    @Before

    public void setUp() {


        usuario = new Usuario("juan","@juan",asignaciones);



    }


    @Test
    public void getGithub () {

        assertEquals(gitHubOriginal,usuario.getGithub());


    }




    @Test
    public void getAsignaciones () {

        assertEquals(asignaciones,usuario.getAsignaciones());


    }

    @Test
    public void getNombre () {

        assertEquals(nombreOriginal,usuario.getNombre());


    }

    @Test

    public  void setGithub () {
        usuario.setGithub(github);
        assertEquals(github,usuario.getGithub());

    }


    @Test

    public  void setNombre () {
        usuario.setNombre(nombre);
        assertEquals(nombre,usuario.getNombre());

    }




}
