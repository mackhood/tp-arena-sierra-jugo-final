package ui.vm;
import com.sun.xml.internal.bind.XmlAccessorFactory;
import dominio.Asignaciones.Asignacion;
import dominio.Repositorios.RepositorioUsuarios;
import dominio.Usuario;
import org.uqbar.commons.utils.Observable;



import java.util.List;


@Observable
public class UnViewModel {

    private Usuario usuario;

    public  UnViewModel(Usuario usuario) {
         this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }


}