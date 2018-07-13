package dominio.Criterios;

import dominio.Asignaciones.AsignacionesConceptuales;

import java.util.ArrayList;

public class CriterioConceptuales implements   Criterio {

    AsignacionesConceptuales asignacionesConceptuales;


    public boolean cumpleCriterio() {

                return asignacionesConceptuales.obtenerListaDeNotas().stream().filter(a-> a.equals("M")).count()== 0;

    }
    public ArrayList<String> obtenerListaDenotas(){
                return asignacionesConceptuales.obtenerListaDeNotas();
    }

    public void  setAsignacionConceptual (AsignacionesConceptuales asignacion) {

        this.asignacionesConceptuales=asignacion;

    }

}
