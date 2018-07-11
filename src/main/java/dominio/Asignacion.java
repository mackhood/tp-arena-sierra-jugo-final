package dominio;

public abstract  class Asignacion {


private String descripcion;
private Criterio criterio;


public Asignacion (String descripcion, Criterio criterio) {

    this.descripcion=descripcion;
    this.criterio=criterio;

}


}
