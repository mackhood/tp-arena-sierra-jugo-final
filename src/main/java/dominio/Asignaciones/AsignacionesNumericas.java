package dominio.Asignaciones;

import dominio.Asignaciones.Asignacion;

import java.util.ArrayList;

public class AsignacionesNumericas extends Asignacion {


    private List<Integer> notas = new ArrayListList<>();


    AsignacionesNumericas ( String descripcion , Criterio criterio) {

        super (descripcion,criterio);
    }

    public int ultimaNota () {

        return notas.get(notas.size() -1);
    }

    public boolean estaAprobado () {

    return criterio.cumpleCriterio(this.notas);
    }

}
