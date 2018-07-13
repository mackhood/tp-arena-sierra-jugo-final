package ui.vm;

import dominio.Asignaciones.Asignacion;
import dominio.Usuario;
import org.uqbar.commons.utils.Observable;

@Observable
public class EditarDatos {
    public Usuario usuario;
    public Asignacion asignacionSeleccionada;
    public String nombre;
    public String github;


    public EditarDatos (Usuario usuario ){
        this.usuario=usuario;
    }

    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }
    public Usuario getUsuario() {
        return usuario;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
        this.usuario.setNombre(nombre);
    }
    public String getNombre() {
         return usuario.getNombre();
    }

    public void setGithub(String github){
        this.github = github;
        this.usuario.setGithub(github);
    }
    public String getGithub() {
        return usuario.getGithub();
    }

    public Asignacion getAsignacionSeleccionada() {
        return asignacionSeleccionada;
    }
    public void setAsignacionSeleccionada(Asignacion unaAsignacion) {
        this.asignacionSeleccionada=unaAsignacion;
    }


    public String getEstado () {

        if(asignacionSeleccionada.estaAprobado()) {
            return "aprobado";
        }
        else {

            return "desaprobado";
        }
    }



}
