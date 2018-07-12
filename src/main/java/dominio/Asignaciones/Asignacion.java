package dominio.Asignaciones;

import dominio.Criterios.Criterio;
import org.uqbar.commons.utils.Observable;

@Observable
public abstract  class Asignacion {


public String descripcion;
public Criterio criterio;
public String ultimaNota;


public Asignacion (String descripcion, Criterio criterio) {

    this.descripcion=descripcion;
    this.criterio=criterio;

}
public String getDescripcion(){
    return  descripcion;
}
public String getUltimaNota(){
        return  ultimaNota;
    }

}
