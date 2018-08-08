package dominio.Asignaciones;

import dominio.Criterios.Criterio;
import dominio.Criterios.CriterioConceptuales;
import org.uqbar.commons.utils.Observable;

@Observable
public abstract  class Asignacion {


public String descripcion;
public Criterio criterio;
public String ultimaNota;
public String estado;

public Asignacion (String descripcion, Criterio criterio) {

    this.descripcion=descripcion;
    this.criterio = criterio;

}
    public void actualizarEstado(){
        this.estado = "Desaprobado";
        if(criterio.cumpleCriterio()){
            estado = "Aprobado";
        }
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
        this.actualizarEstado();
        return estado;
    }


    public Criterio getCriterio()
    {
        return criterio;
    };
}
