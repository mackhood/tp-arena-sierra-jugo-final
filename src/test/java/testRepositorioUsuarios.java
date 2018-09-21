import dominio.Repositorios.RepositorioUsuarios;
import dominio.Usuario;
import net.sf.oval.constraint.AssertFalse;
import net.sf.oval.constraint.AssertNull;
import net.sf.oval.constraint.AssertNullCheck;
import org.apache.commons.lang.ObjectUtils;
import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.matchers.Null;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.List;

public class testRepositorioUsuarios
{


    private RepositorioUsuarios repositorioUsuarios ;
    private List<Usuario> usuarios = null;
    @Before

    public void setup () {
        repositorioUsuarios = new RepositorioUsuarios();
    }


    @Test


    public void obtenerUsuarios () {

        assertThat( repositorioUsuarios.obtenerUsuarios(),is(not(usuarios)));


    }





}
