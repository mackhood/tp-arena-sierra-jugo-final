package dominio.Criterios;

import dominio.Asignaciones.Asignacion;
import dominio.Asignaciones.AsignacionesConceptuales;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CriterioConceptuales implements Criterio {

    AsignacionesConceptuales asignacionesConceptuales;

    public boolean cumpleCriterio() {

                return asignacionesConceptuales.obtenerListaDeNotas().stream().filter(a-> a.equals("M")).count()>1;

    }

 public void  setAsignacionConceptual (AsignacionesConceptuales asignacion) {

        this.asignacionesConceptuales=asignacion;

    }

}
