package dominio.Criterios;

import dominio.Asignaciones.AsignacionesConceptuales;

import java.util.ArrayList;
import java.util.List;

public class CriterioConceptuales implements   Criterio {

    AsignacionesConceptuales asignacionConceptual;


    public boolean cumpleCriterio() {

                return asignacionConceptual.obtenerListaDeNotas().stream().filter(a-> a.equals("M")).count()== 0;

    }
    public List<String> obtenerListaDenotas(){
                return asignacionConceptual.obtenerListaDeNotas();
    }

    public void  setAsignacionConceptual (AsignacionesConceptuales asignacion) {

        this.asignacionConceptual=asignacion;

    }

}
