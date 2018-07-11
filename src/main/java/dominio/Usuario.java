package dominio;

import dominio.Asignaciones.Asignacion;

import java.util.ArrayList;
import java.util.List;



public class Usuario {

    private String nombre;

    private String github;
    private List<Asignacion> asignaciones = new ArrayList<>();


    public Usuario(String nombre, String github, List<Asignacion> asignaciones) {

        this.nombre = nombre;
        this.github = github;
        this.asignaciones = asignaciones;
    }
}