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

    public  UnViewModel() {
         this.usuarios = new RepositorioUsuarios().obtenerUsuario();
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuario(Usuario usuario){
        this.usuarios = usuarios;
    }

}