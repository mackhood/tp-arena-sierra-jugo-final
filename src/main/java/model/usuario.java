package model;

import java.util.ArrayList;
import java.util.List;



public class Usuario {

private String nombre;

private String github;
private List<Asignacion> asignaciones = new ArrayList<> ();


    public Usuario(String nombre, String github, Lista<Asignacion> asignaciones) {

        this.nombre = nombre;
        this.github = github;
        this.asignaciones = asignaciones;
       }
