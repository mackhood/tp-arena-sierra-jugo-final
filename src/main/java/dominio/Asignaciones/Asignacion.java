package dominio.Asignaciones;

import dominio.Criterios.Criterio;

public abstract  class Asignacion {


private String descripcion;
public Criterio criterio;


public Asignacion (String descripcion, Criterio criterio) {

    this.descripcion=descripcion;
    this.criterio=criterio;

}


}
