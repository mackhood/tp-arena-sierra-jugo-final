package dominio;

import dominio.Asignaciones.Asignacion;
import org.uqbar.commons.utils.Observable;

import java.util.ArrayList;
import java.util.List;


@Observable
public class Usuario {

    private String nombre;
    private String github;
    private List<Asignacion> asignaciones = new ArrayList<>();



    public Usuario(String nombre, String github, List<Asignacion> asignaciones) {

        this.nombre = nombre;
        this.github = github;
        this.asignaciones = asignaciones;
    }



    public String nombre() {
        return nombre;
    }


    public  List<Asignacion>  getAsignaciones() {
        return asignaciones;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }
}