package ui.vm;

import dominio.Asignaciones.Asignacion;
import dominio.Usuario;
import org.uqbar.commons.utils.Observable;

@Observable
public class EditarDatosModel {
    public Usuario usuario;
    public Asignacion asignacionSeleccionadaDeUnUsuario = null;


    public EditarDatosModel (Usuario usuario ){
        this.usuario=usuario;
    }

    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public Asignacion getAsignacionSeleccionadaDeUnUsuario() {return asignacionSeleccionadaDeUnUsuario;}
    public void setAsignacionSeleccionadaDeUnUsuario(Asignacion unaAsignacion) {this.asignacionSeleccionadaDeUnUsuario=unaAsignacion;    }


}
