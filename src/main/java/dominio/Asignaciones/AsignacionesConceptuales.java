package dominio.Asignaciones;

import dominio.Asignaciones.Asignacion;

import java.util.ArrayList;

public class AsignacionesConceptuales extends Asignacion {

    private ArrayList<String> notas = new ArrayList<String>();


 AsignacionesConceptuales ( String descripcion , Criterio criterio) {

     super (descripcion,criterio);


 }

    public String ultimaNota () {

        return notas.get(notas.size() -1);
    }

    public boolean estaAprobado () {

     return criterio.cumpleCriterio(this.notas);
    }

}
