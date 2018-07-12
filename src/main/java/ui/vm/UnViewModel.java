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

    public  UnViewModel(List<Usuario> usuarios) {
         this.usuarios = usuarios;
    }

    public List<Usuario> getUsuario() {
        return usuarios;
    }
    public void setUsuario(Usuario usuario){
        this.usuarios = usuarios;
    }


}