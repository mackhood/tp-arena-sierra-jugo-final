package ui.vm;
import com.sun.xml.internal.bind.XmlAccessorFactory;
import dominio.Asignaciones.Asignacion;
import dominio.Repositorios.RepositorioUsuarios;
import dominio.Usuario;
import org.uqbar.commons.utils.Observable;

import java.util.List;


@Observable
public class UnViewModel {

    public Usuario usuario;

    public UnViewModel() {
         usuario = new RepositorioUsuarios().obtenerUsuario();
    }

}