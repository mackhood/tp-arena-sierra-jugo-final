package ui.vm;
import com.sun.xml.internal.bind.XmlAccessorFactory;
import dominio.Asignaciones.Asignacion;
import dominio.Repositorios.RepositorioUsuarios;
import dominio.Usuario;
import org.uqbar.commons.utils.Observable;
import ui.windows.UnaView;


import java.util.List;


@Observable
public class UnViewModel {

    private List<Usuario> usuarios;
    private Usuario usuarioSeleccionado;
    private UnaView view;

    public  UnViewModel( ) {
        this.usuarios = new RepositorioUsuarios().obtenerUsuario();
        this.view = view;

    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuario(Usuario usuario){
        this.usuarios = usuarios;
    }

    public Usuario getUsuarioSeleccionado() {
        return usuarioSeleccionado;
    }

    public void setUsuarioSeleccionado(Usuario usuarioSeleccionado) {
        this.usuarioSeleccionado = usuarioSeleccionado;
    }

}