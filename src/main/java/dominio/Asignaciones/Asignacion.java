package dominio.Asignaciones;

import dominio.Criterios.Criterio;
import dominio.Criterios.CriterioConceptuales;
import org.uqbar.commons.utils.Observable;

@Observable
public abstract  class Asignacion {


public String descripcion;
public Criterio criterio;
public String ultimaNota;


public Asignacion (String descripcion, Criterio criterio) {

    this.descripcion=descripcion;
    this.criterio = criterio;

}

    public boolean estaAprobado () {
        return criterio.cumpleCriterio();
    }

    public String getDescripcion(){
    return  descripcion;
}

    public String getUltimaNota(){
        return  ultimaNota;
    }

    public String getEstado(){
        String estado = "Desaprobado";
        if(criterio.cumpleCriterio()){
            estado = "Aprobado";
        }
        return estado;
    }


    public Criterio getCriterio()
    {
        return criterio;
    };
}
