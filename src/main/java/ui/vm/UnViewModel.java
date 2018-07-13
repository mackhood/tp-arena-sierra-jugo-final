package ui.vm;
import com.sun.xml.internal.bind.XmlAccessorFactory;
import dominio.Asignaciones.Asignacion;
import dominio.Repositorios.RepositorioUsuarios;
import dominio.Usuario;
import org.uqbar.commons.utils.Observable;



import java.util.List;


@Observable
public class UnViewModel {

    private List<Usuario> usuarios;
    public Usuario usuarioSeleccionado;


    public  UnViewModel( ) {
        this.usuarios = new RepositorioUsuarios().obtenerUsuarios();

    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios){
        this.usuarios = usuarios;
    }

    public Usuario getUsuarioSeleccionado() {
        return usuarioSeleccionado;
    }

    public void setUsuarioSeleccionado(Usuario usuarioSeleccionado) {
        this.usuarioSeleccionado = usuarioSeleccionado;
    }

}