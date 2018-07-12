package ui.vm;
import com.sun.xml.internal.bind.XmlAccessorFactory;
import dominio.Usuario;
import org.uqbar.commons.utils.Observable;


@Observable
public class UnViewModel {

    private Usuario usuario;

    public UnViewModel(Usuario usuario) {
        this.usuario = usuario;
    }

}