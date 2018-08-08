package dominio.Criterios;

import dominio.Asignaciones.Asignacion;
import dominio.Asignaciones.AsignacionesConceptuales;
import dominio.Asignaciones.AsignacionesNumericas;

public class CriterioNumericas implements Criterio {

     AsignacionesNumericas asignacionesNumericas;



    public boolean cumpleCriterio() {
        return asignacionesNumericas.obtenerListaDeNotas().stream().filter(a-> a >= 6).count() > 1;
    }


  public  void  setAsignacionesNumericas (AsignacionesNumericas asignacion) {

        this.asignacionesNumericas =asignacion;

    }



}
