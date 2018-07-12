package ui.vm;

import dominio.Asignaciones.Asignacion;
import dominio.Usuario;
import org.uqbar.commons.utils.Observable;

@Observable
public class EditarDatos {
    public Usuario usuario;
    public Asignacion asignacionSeleccionada;

    public EditarDatos (Usuario usuario ){
        this.usuario=usuario;
    }

    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }
    public Usuario getUsuario() {
        return usuario;
    }

    public Asignacion getAsignacionSeleccionada() {
        return asignacionSeleccionada;
    }
    public void setAsignacionSeleccionada(Asignacion unaAsignacion) {
        this.asignacionSeleccionada=unaAsignacion;
    }

}
