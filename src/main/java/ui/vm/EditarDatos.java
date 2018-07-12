package ui.vm;

import dominio.Usuario;
import org.uqbar.commons.utils.Observable;

@Observable
public class EditarDatos {
    public Usuario usuario;
    public EditarDatos (Usuario usuario ){
        this.usuario=usuario;
    }

    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }
    public Usuario setUsuario() {
        return usuario;
    }
}
