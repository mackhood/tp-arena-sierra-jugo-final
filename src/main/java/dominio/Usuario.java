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

    public List<Asignacion>obtenerAsignaciones() {
        return asignaciones;
    }

    public String nombre() {
        return nombre;
    }
    public  List<Asignacion>  asignacions() {
        return asignaciones;
    }
}